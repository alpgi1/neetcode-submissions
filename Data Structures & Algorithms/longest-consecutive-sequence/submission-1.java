class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums){
            if(!set.contains(num-1)){
                int count = 0;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
