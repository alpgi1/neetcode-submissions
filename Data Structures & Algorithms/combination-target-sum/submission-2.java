class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums, target, 0, new ArrayList<>());
        return ret;
    }

    public void backtrack(int[] nums, int remaining, int start, ArrayList<Integer> list){
        if(remaining == 0){
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(nums[i] > remaining) break;
            list.add(nums[i]);
            backtrack(nums, remaining - nums[i], i, list);
            list.remove(list.size()-1);
        }
    }
}
