class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Deque<int[]> stack = new ArrayDeque<>();
        boolean added = false;


        for(int[] interval: intervals){
            if (!added && newInterval[0] < interval[0]) {
                push(stack, newInterval);
                added = true;
            }
            push(stack, interval);
        }
        if (!added) push(stack, newInterval);   // en sona aitse

        int[][] ret = new int[stack.size()][];
        int i = 0;
        while (!stack.isEmpty()) ret[i++] = stack.pollLast();
        return ret;
    }

    private void push(Deque<int[]> stack, int[] cur) {
        if (!stack.isEmpty() && cur[0] <= stack.peek()[1]) {
            int[] top = stack.pop();
            stack.push(new int[]{top[0], Math.max(top[1], cur[1])});
        } else {
            stack.push(cur);
        }
    }
}
