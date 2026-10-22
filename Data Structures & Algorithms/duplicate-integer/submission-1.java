class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (!hasDuplicateHelper(i,nums)) return true;
        }
        return false;
    }

    public boolean hasDuplicateHelper(int i, int[]nums){
        for (int j = 1; j < nums.length - i; j++) {
            if (nums[i] == nums[i+j]) return false;
        }
        return true;
    }
}