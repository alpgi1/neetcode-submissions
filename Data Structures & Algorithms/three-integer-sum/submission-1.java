class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int first = nums[i];
            int left = i+1, right = nums.length -1;
            while(right > left){
                int sum = nums[left] + nums[right] + first;
                if(sum == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[left]);
                    l.add(nums[right]);
                    l.add(first);
                    list.add(l);
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }else if(sum < 0) left++;
                else right--;
            }
        }
        return list;
    }
}
