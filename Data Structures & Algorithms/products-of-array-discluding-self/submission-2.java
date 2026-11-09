class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int mul = 1;
        for(int i = nums.length - 1; i > 0; i--){
            mul *= nums[i];
            stack.push(mul);
        }
        mul = 1;
        for(int i = 0; i < nums.length; i++){
            if(stack.isEmpty()){
                ret[i] = mul;
            }else{
            ret[i] = mul * stack.pop();
            mul *= nums[i];
            }
        }
        return ret;
    }
}  
