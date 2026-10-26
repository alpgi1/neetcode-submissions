class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, Integer> set = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            String s = strs[i];
            for(int f = 0; f < s.length(); f++){
                map.put(s.charAt(f), map.getOrDefault(s.charAt(f), 0)+1);
            }
            if(set.containsKey(map)){
                int location = set.get(map);
                list.get(location).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                list.add(l);
                set.put(map, list.size()-1);
            }
        }
        return list;
    }
}
