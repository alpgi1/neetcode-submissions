class Solution {
    public int countSubstrings(String s) {
        int ret = 0;
        for(int i = 0; i < s.length()-1; i++){
            ret = ret + substring(s,i,i) + substring(s,i,i+1);
        }
        return ret+1;
    }

    public int substring(String s, int l, int r){
        int ret = 0;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            ret++;
            l--;
            r++;
        }
        return ret;
    }
}
