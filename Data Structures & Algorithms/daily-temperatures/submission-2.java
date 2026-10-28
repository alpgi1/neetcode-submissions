class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] ret = new int[temps.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< temps.length; i++){
            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
                int day = stack.pop();
                ret[day] = i - day;
            }
            stack.push(i);
        }
        return ret;
    }
}
