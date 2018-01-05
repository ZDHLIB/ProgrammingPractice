package Easy;

public class Q367 {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        if(num == 0) return true;
        while(left <= right){
            int mid = left + (right - left)/2;
            if( mid == (double)num/mid){
                return true;
            }else if(mid < num/mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}
