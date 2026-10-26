class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ret = new int[temp.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i<temp.length; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int day = stack.pop();
                ret[day] = i - day;
            }
            stack.push(i);
        }
        return ret;
    }
}
