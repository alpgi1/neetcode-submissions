class Solution {
    private List<String> res = new ArrayList<>();
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    public void backtrack(String digits, int index, StringBuilder s){
        if(s.length() == digits.length()){
            res.add(s.toString());
            return;
        }
        String chars = digitToChar[digits.charAt(index) - '0'];
        for(int i = 0; i < chars.length(); i++){
            s.append(chars.charAt(i));
            backtrack(digits, index + 1, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
