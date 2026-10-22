class Solution {
    public int[] productExceptSelf(int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);
        int mul = 1;

        for(int num: nums){
            mul *= num;
            queue.add(mul);
        }
        int mul2 = 1;
        stack.push(1);
        for(int i = nums.length -1; i>=1;i--){
            mul2 *= nums[i];
            stack.push(mul2);
        }

        int[] ret = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            int a = queue.poll();
            int b = stack.pop();
            ret[i] = a * b;
        }
        return ret;
    }
}  
