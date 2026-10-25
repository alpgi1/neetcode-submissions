class Solution {
    public void rotate(int[][] matrix) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < matrix.length; i++){
            for(int f = 0; f < matrix.length; f++){
                stack.push(matrix[i][f]);
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int f = matrix.length-1; f>= 0; f--){
                matrix[f][i] = stack.pop();
            }
        }
    }
}
