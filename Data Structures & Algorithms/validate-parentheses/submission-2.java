class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            switch (c){
                case '(' -> stack.push(c);
                case ')' -> {
                if(stack.isEmpty()) return false;

                    char c2 = stack.pop();
                    if(c2 != '(') return false;
                }
                case '{' -> stack.push(c);
                case '}' -> {
                if(stack.isEmpty()) return false;
                    char c2 = stack.pop();
                    if(c2 != '{') return false;
                }
                case '[' -> stack.push(c);
                case ']' -> {
                    if(stack.isEmpty()) return false;
                    char c2 = stack.pop();
                    if(c2 != '[') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
