class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l = 0, max = 0, maxF = 0;
        for(int r = 0; r < s.length(); r++){
            int pos = s.charAt(r) - 'A';
            arr[pos]++;
            maxF = Math.max(maxF, arr[pos]);
            while((r-l+1) > k + maxF){
                int posL = s.charAt(l++) - 'A';
                arr[posL]--;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
