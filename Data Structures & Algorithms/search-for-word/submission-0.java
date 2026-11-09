class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int f = 0; f < board[0].length; f++){
                if(board[i][f] == word.charAt(0)){
                    used[i][f] = true;
                    if(backtrack(board, used, word, 1, i, f)) return true;
                    used[i][f] = false;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, boolean[][] used, String word, int index,int i, int f){
        if(index == word.length()) return true;

        if(i > 0 && !used[i-1][f] && board[i-1][f] == word.charAt(index)){
            used[i-1][f] = true;
            if(backtrack(board, used, word, index+1, i-1, f)) return true;
            used[i-1][f] = false;
        }
        if(i < board.length - 1 && !used[i+1][f] && board[i+1][f] == word.charAt(index)){
            used[i+1][f] = true;
            if(backtrack(board, used, word, index+1, i+1, f)) return true;
            used[i+1][f] = false;
        }
        if(f > 0 && !used[i][f-1] && board[i][f-1] == word.charAt(index)){
            used[i][f-1] = true;
            if(backtrack(board, used, word, index+1, i, f-1)) return true;
            used[i][f-1] = false;
        }
        if(f < board[0].length - 1 && !used[i][f+1] && board[i][f+1] == word.charAt(index)){
            used[i][f+1] = true;
            if(backtrack(board, used, word, index+1, i, f+1)) return true;
            used[i][f+1] = false;
        }
        return false;
    }
}
