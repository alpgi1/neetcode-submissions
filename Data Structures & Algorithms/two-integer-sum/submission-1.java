class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];
        map.put(nums[0], 0);
        for(int i = 1; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ret[0] = map.get(target - nums[i]);
                ret[1] = i;
                return ret;
            }else{
                map.put(nums[i], i);
            }
        }
        return ret;
    }
}
