class Solution {
    public boolean isPalindrome(String s) {
       int a = 0;
       int b = s.length() - 1;

       while(a < b){
        while(a<b && !alphaNum(s.charAt(a))){
            a++;
        }
        while(a<b && !alphaNum(s.charAt(b))){
            b--;
        }
        if (s.toLowerCase().charAt(a++) != s.toLowerCase().charAt(b--)) return false;
       } 
       return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
