package LeetCode.Easy;

public class Q633 {
    public boolean judgeSquareSum(int c) {
        for(long i=0; i * i <= c; i++){
            int n = c - (int)(i * i);
            if( bfs(0, n, n) )
                return true;
        }
        return false;
    }

    private boolean bfs(long left, long right, int n){
        while(left <= right){
            long mid = left + (right-left)/2;
            if( mid * mid == n ){
                return true;
            }else if( mid * mid < n ){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}
