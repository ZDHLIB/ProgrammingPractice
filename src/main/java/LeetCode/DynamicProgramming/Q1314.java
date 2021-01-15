package LeetCode.DynamicProgramming;

public class Q1314 {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] mat1 = new int[rows+1][cols+1];
        int[][] res = new int[rows][cols];

        mat1[1][1] = mat[0][0];
        for(int i = 2; i <= cols; i++){
            mat1[1][i] = mat[0][i-1] + mat1[1][i-1];
        }
        for(int i = 2; i <= rows; i++){
            mat1[i][1] = mat[i-1][0] + mat1[i-1][1];
        }
        for(int i = 2; i <= rows; i++){
            for(int j = 2; j <= cols; j++){
                mat1[i][j] = mat[i-1][j-1] + mat1[i-1][j] + mat1[i][j-1] - mat1[i-1][j-1];
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int m1 = Math.max(0, i - K);
                int n1 = Math.max(0, j - K);
                int m2 = Math.min(rows, i+K+1);
                int n2 = Math.min(cols, j+K+1);
                res[i][j] = mat1[m2][n2] - mat1[m1][n2] - mat1[m2][n1] + mat1[m1][n1];
            }
        }

        return res;
    }
}
