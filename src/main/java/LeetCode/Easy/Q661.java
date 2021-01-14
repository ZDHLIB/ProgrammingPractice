package LeetCode.Easy;

public class Q661 {
    public int[][] imageSmoother(int[][] M) {
        int R = M.length, C = M[0].length;
        int[][] ans = new int[R][C];

        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                int count = 0;
                for( int r = i-1; r <= i+1; r++ ){
                    for( int c = j-1; c <= j+1; c++ ){
                        if( r>=0 && r<R && c>=0 && c<C ){
                            ans[i][j] += M[r][c];
                            count++;
                        }
                    }
                }
                ans[i][j] /= count;
            }
        }
        return ans;
    }
}
