class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int max = 0;

        for(int num: nums){
            if(!set.contains(num-1)){
                int count = 1;
                int n = num;
                while(true){
                    if(set.contains(n+1)){
                        count++;
                        n++;
                    }else break;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
