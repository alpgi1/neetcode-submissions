class Solution {
    public int maxArea(int[] heights) {
        int max = 0, l = 0, r = heights.length - 1;
        while(l < r){
            max = Math.max(max, (r-l) * Math.min(heights[l], heights[r]));
            if(heights[r] > heights[l]) l++;
            else r--;
        }
        return max;
    }
}
