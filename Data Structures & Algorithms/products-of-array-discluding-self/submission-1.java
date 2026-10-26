class Solution {
    public int[] productExceptSelf(int[] nums) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack2.push(1);
        int sum = 1;
        for(int i = 0; i < nums.length-1; i++){
            sum*=nums[i];
            stack1.push(sum);
        }
        sum=1;
        for(int i = nums.length-1; i>= 1; i--){
            sum*=nums[i];
            stack2.push(sum);
        }
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ret[i] = stack2.pop();
        }
        for(int i = nums.length-1; i>= 1; i--){
            ret[i] *= stack1.pop();
        }
        return ret;
    }
}  
