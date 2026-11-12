class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int t = 0, b = matrix.length-1;
        while(t <= b){
            int mid = (b-t) / 2 + t;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] > target){
                b = mid - 1;
            }else{
                t = mid + 1;
            }
        }

        if(b < 0) return false;
        int row = b;

        int l = 0, r = matrix[0].length-1;
        while(l <= r){
            int m = (r-l) / 2 + l;
            if(matrix[row][m] == target) return true;
            if(matrix[row][m] > target){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return false;
    }
}
