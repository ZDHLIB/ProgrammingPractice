package LeetCode.Easy;

public class Q69 {
    public int mySqrt(int x) {
        int left = 1, right  = x;
        if(right == 0) return 0;
        while(left < right){
            int mid = left + (right - left)/2;
            if( mid == x/mid ){
                return mid;
            }else if(mid < x/mid && (mid+1) > x/(mid+1)){
                return mid;
            }else if( mid < x/mid ){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return left;
    }
}
