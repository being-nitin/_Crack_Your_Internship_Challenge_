class Solution {
    public int[][] transpose(int[][] matrix) {
        int outer = matrix[0].length;
        int inner = matrix.length;
        int[][] transposed = new int[outer][inner]; 
        for(int i=0;i<outer;i++){
            for(int j=0;j<inner;j++){
                transposed[i][j] = matrix[j][i];
                }
        }
        return transposed;
    }
}