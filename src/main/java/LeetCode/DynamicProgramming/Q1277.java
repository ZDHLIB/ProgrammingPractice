package LeetCode.DynamicProgramming;

public class Q1277 {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 1){
                res[i][0] = 1;
            }
        }

        for(int i = 0; i < cols; i++){
            if(matrix[0][i] == 1){
                res[0][i] = 1;
            }
        }

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 1){
                    res[i][j]++;
                    int up = res[i-1][j];
                    int left = res[i][j-1];
                    int up_left = res[i-1][j-1];
                    res[i][j] += Math.min(up, Math.min(left, up_left));
                }
            }
        }

        int s = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                s += res[i][j];
            }
        }
        return s;
    }
}
