class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        Deque<int[]> stack = new ArrayDeque<>();

        for(int[] interval: intervals){
            if(!stack.isEmpty() && stack.peek()[1] >= interval[0]){
                int[] popped = stack.pop();
                stack.push(new int[]{popped[0], Math.max(interval[1], popped[1])});
            }else{
                stack.push(interval);
            }
        }
        int[][] ret = new int[stack.size()][2];
        int i = 0;
        while(!stack.isEmpty()){
            ret[i++] = stack.pollLast();
        }
        return ret;
    }
}
