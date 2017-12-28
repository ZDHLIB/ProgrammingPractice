package Easy;

public class Q374 {
    private int g = 6;
    public int guessNumber(int n) {
        int left = 1, right = n, tmp = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if( guess(mid) == 0 ){
                return mid;
            } else if( guess(mid) == -1 ){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private int guess(int n){
        if( n == g ){
            return 0;
        }else if( n > g ){
            return 1;
        }else{
            return -1;
        }
    }
}
