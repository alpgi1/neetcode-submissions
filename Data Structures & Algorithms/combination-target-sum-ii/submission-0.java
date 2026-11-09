class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums, target, 0, new ArrayList<>());
        return ret;
    }

    public void backtrack(int[] nums, int remaining, int count, List<Integer> list){
        if(remaining == 0){
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int i = count; i < nums.length; i++){
            if (i > count && nums[i] == nums[i - 1]) continue;
            if(nums[i] > remaining) break;
            list.add(nums[i]);
            backtrack(nums, remaining - nums[i], i+1, list);
            list.remove(list.size()-1);
        }
    }
}
