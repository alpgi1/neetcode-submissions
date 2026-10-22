class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mapS = new HashMap();
        for(int i = 0; i < s.length(); i++){
            int j = mapS.getOrDefault(s.charAt(i), 0);
            mapS.put(s.charAt(i), j+1);
        }
        HashMap<Character, Integer> mapT = new HashMap();
        for(int i = 0; i < t.length(); i++){
            int j = mapT.getOrDefault(t.charAt(i), 0);
            mapT.put(t.charAt(i), j+1);
        }
        for(int i = 0; i< s.length(); i++){
            if(!mapS.get(s.charAt(i)).equals(mapT.get(s.charAt(i)))) return false;
        }
        return true;
    }
}
