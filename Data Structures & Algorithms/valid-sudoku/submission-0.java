class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> listZeilen = new ArrayList<>();
        List<HashSet<Character>> listSpalten = new ArrayList<>();
        List<HashSet<Character>> listBox = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            listZeilen.add(new HashSet<Character>());
            listSpalten.add(new HashSet<Character>());
            listBox.add(new HashSet<Character>());
        }

        for(int i = 0; i < board.length; i++){
            for(int f = 0; f < board.length; f++){
                if (board[i][f] == '.') continue;
                if(listZeilen.get(i).contains(board[i][f])) return false;
                listZeilen.get(i).add(board[i][f]);

                if(listSpalten.get(f).contains(board[i][f])) return false;
                listSpalten.get(f).add(board[i][f]);

                if(listBox.get((i/3) * 3 + (f/3)).contains(board[i][f])) return false;
                listBox.get((i/3) * 3 + (f/3)).add(board[i][f]);
            }
        }
        return true;
    }
}
