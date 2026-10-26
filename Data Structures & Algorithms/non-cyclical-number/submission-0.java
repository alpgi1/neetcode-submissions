class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);
            if(set.contains(1)) return true;
            int sum = 0;
            while(n > 0){
                int now = n % 10;
                sum += (now * now);
                n/=10;
            }
            n = sum;
        }
        return false;
    }
}
