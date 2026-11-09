class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<>();
        list.add(l);
        for(int i = 0; i < nums.length; i++){
            int size = list.size();
            for(int f = 0; f < size; f++){
                List<Integer> ls = new ArrayList<>(list.get(f));
                ls.add(nums[i]);
                list.add(ls);
            }
        }
        return list;
    }
}
