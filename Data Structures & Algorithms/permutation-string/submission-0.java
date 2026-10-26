class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> maps1 = new HashMap<>();
        HashMap<Character, Integer> maps2 = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            maps1.put(s1.charAt(i), maps1.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(int i = 0; i< s1.length()-1; i++){
            maps2.put(s2.charAt(i), maps2.getOrDefault(s2.charAt(i), 0)+1);
        }

        int l = 0;
        for(int r = s1.length()-1; r < s2.length(); r++){
            maps2.put(s2.charAt(r), maps2.getOrDefault(s2.charAt(r), 0)+1);
            if(maps2.equals(maps1)) return true;
            if(maps2.get(s2.charAt(l)) > 1){
                maps2.put(s2.charAt(l), maps2.get(s2.charAt(l)) -1);
            }else{
                maps2.remove(s2.charAt(l));
            }
            l++;
        }
        return false;
    }
}
