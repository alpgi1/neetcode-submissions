class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return ret;
    }

    public void backtrack(int[] nums, List<Integer> list, boolean[] used){
        if(list.size() == nums.length){
            ret.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
                backtrack(nums, list, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
