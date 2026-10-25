class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length()-1;i++){
            count += expand(s,i,i);
            count += expand(s,i,i+1);
        }
        return count + 1;
    }

    private int expand(String s, int left, int right) {
        int found = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            found++;      // her başarılı genişleme yeni bir palindrom
            left--;
            right++;
        }
        return found;
    }
}
