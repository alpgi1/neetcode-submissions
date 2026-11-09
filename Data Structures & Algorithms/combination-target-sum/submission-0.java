public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums,0,target,new ArrayList<>());
        return res;
    }

    public void backtrack(int[] nums, int start, int remaining, List<Integer> l) {
        if(remaining == 0){
            res.add(new ArrayList<>(l));
            return;
        }

        for (int i = start; i < nums.length; i++){
            if(nums[i] > remaining) break;
            l.add(nums[i]);
            backtrack(nums, i, remaining - nums[i], l);
            l.remove(l.size() - 1);
        }
    }
}