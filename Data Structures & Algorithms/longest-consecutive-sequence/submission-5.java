class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);
        int max = 0;
        for(int n: nums){
            if(!set.contains(n-1)){
                int count = 0;
                while(set.contains(n)){
                    n++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
