class Solution {
    List<String> ret = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(2*n, 0, 0, new StringBuilder());
        return ret;
    }

    public void backtrack(int remaining, int l, int r, StringBuilder s){
        if(remaining == 0){
            ret.add(s.toString());
            return;
        }

        if(l < (remaining + l + r) / 2){
            s.append('(');
            backtrack(remaining-1, l+1, r, s);
            s.deleteCharAt(s.length()-1);
        }
        if(r < l){
            s.append(')');
            backtrack(remaining-1, l, r+1, s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
