class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) { mark(board, i, 0); mark(board, i, n - 1); }
        for (int j = 0; j < n; j++) { mark(board, 0, j); mark(board, m - 1, j); }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'S') board[i][j] = 'O';
            }
    }

    private void mark(char[][] b, int i, int j) {
        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length || b[i][j] != 'O') return;
        b[i][j] = 'S';
        mark(b, i + 1, j); mark(b, i - 1, j); mark(b, i, j + 1); mark(b, i, j - 1);
    }
}