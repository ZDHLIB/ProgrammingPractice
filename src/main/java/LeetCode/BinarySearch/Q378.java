package LeetCode.BinarySearch;

public class Q378 {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[rows-1][cols-1];

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int counts = count(mid, matrix, rows, cols);
            if(counts < k){
                low = mid + 1;
            } else if(counts >= k) {
                high = mid - 1;
            }
        }
        return low;
    }

    private int count(int n, int[][] matrix, int rows, int cols){
        int counts = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] <= n){
                    counts++;
                }
            }
        }
        return counts;
    }
}
