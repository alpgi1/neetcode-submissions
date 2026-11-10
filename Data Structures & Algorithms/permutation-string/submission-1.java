class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) +1);
        }
        for(int i = 0; i < s1.length()-1; i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) +1);
        }
        int l = 0;
        for(int r = s1.length()-1; r < s2.length(); r++){
            map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r), 0) +1);
            if(map2.equals(map1)) return true;
            char leftChar = s2.charAt(l);
            map2.put(leftChar, map2.get(leftChar) - 1);
            if (map2.get(leftChar) == 0) {
                map2.remove(leftChar);
            }
            
            l++;
        }
        return false;
    }
}
