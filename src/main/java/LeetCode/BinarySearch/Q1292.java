package LeetCode.BinarySearch;

public class Q1292 {
    public int maxSideLength(int[][] mat, int threshold) {
        int rows = mat.length;
        int cols = mat[0].length;
        int low = 1;
        int high = Math.min(rows, cols);
        int count = 0;

        int[][] preSums = new int[rows+1][cols+1];
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                preSums[i][j] = mat[i-1][j-1] + preSums[i-1][j] - preSums[i-1][j-1] + preSums[i][j-1];
            }
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;

            TAG:
            for(int i = 0; i + mid <= rows; i++){
                for(int j = 0; j + mid <= cols; j++){
                    int sum = preSums[i+mid][j+mid] - preSums[i][j+mid] - preSums[i+mid][j] + preSums[i][j];
                    // System.out.println(sum);
                    if(sum <= threshold) {
                        count++;
                        break TAG;
                    }
                }
            }
            if(count > 0){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            count = 0;
        }

        return high;
    }


}
