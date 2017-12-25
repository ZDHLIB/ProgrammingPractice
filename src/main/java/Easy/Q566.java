package Easy;

public class Q566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] mat = new int[r][c];
        int sr = nums.length, sc = nums[0].length;
        if( sr*sc != r*c ){
            return nums;
        }
        for(int i = 0; i < sr; i++){
            for(int j = 0; j < sc; j++){
                int nx = (i*sc + j)/c;
                int ny = (i*sc + j - nx*c)%c;
                mat[nx][ny] = nums[i][j];
            }
        }
        return mat;
    }
}
