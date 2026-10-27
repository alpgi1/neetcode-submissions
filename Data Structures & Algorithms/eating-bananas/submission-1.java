class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int min = 1, max = piles[piles.length - 1];
        int ans = max;
        while(min <= max){
            int mid = (max - min) / 2 + min;
            if(tr(piles, h, mid)){
                ans = mid;
                max = mid - 1;
            }else min = mid+1;
        }
        return ans;
    }

    public boolean tr(int[] piles, int h, int speed){
        long hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed;
        }
        return hours <= h;
    }
}
