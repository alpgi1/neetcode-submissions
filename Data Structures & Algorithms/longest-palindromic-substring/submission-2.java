class Solution {
    private int start = 0, maxLen = 0;

    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            helper(s,i,i);
            if(i<s.length() -1){
                helper(s,i,i+1);
            }
        }
        return s.substring(start, start+maxLen);
    }

    public void helper(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        left++;
        right--;
        if(right - left + 1 > maxLen) {
            maxLen = right - left + 1;
            start = left;
        }
    }
}
