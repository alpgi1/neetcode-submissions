class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){//-1, -1
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            List<List<Integer>> list = twoSum(nums, i+1, -1 * nums[i]);
            for(int f = 0; f < list.size(); f++){
                List<Integer> l = list.get(f);
                l.add(0, nums[i]);
                ret.add(l);
            }
        }
        return ret;
    }

    public List<List<Integer>> twoSum(int[] nums, int l, int target){
        int r = nums.length-1;
        List<List<Integer>> list = new ArrayList<>();
        while(r > l){
            if(nums[l] + nums[r] == target){
                List<Integer> lst = new ArrayList<>();
                lst.add(nums[l]);
                lst.add(nums[r]);
                list.add(lst);
                r--;
                l++;
                while (l < r && nums[l] == nums[l - 1]) l++;
            }
            else if(nums[l] + nums[r] > target){
                r--;
            }else{
                l++;
            }
        }
        return list;
    }
}
