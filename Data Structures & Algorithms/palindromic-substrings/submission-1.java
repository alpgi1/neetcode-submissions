class Solution {
    public int countSubstrings(String s) {
        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            ret += helper(s,i,i);
            if(i < s.length()-1){
                ret += helper(s,i,i+1);
            }
        }
        return ret;
    }

    public int helper(String s, int left, int right){
        int ret = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) ==s.charAt(right)){
            ret++;
            left--;
            right++;
        }
        return ret;
    }
}
