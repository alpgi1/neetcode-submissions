class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1, max = 0;

        while(r>l){
            int sum = heights[l] > heights[r] ? heights[r] * (r-l) : heights[l] * (r-l);
            max = Math.max(max, sum);

            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return max;
    }
}
