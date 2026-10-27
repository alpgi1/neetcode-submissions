class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        // 1) Doğru satırı bul
        int top = 0, bottom = m - 1, row = -1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (target < matrix[mid][0]) bottom = mid - 1;
            else if (target > matrix[mid][n - 1]) top = mid + 1;
            else { row = mid; break; }
        }
        if (row == -1) return false;

        // 2) O satırda ara
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (matrix[row][mid] == target) return true;
            if (matrix[row][mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
