package LeetCode.Easy;

public class Sqrt_x_ {
    public int mySqrt(int x) {
//Use Newton method
//        int r = x;
//        while(r > x/r){
//            r = (r + x/r)/2;
//        }
//        return r;
//====================================================
//Use binary search
//        if (x == 0)
//            return 0;
//        int left = 1, right = Integer.MAX_VALUE;
//        while (true) {
//            int mid = left + (right - left)/2;
//            if (mid > x/mid) {
//                right = mid - 1;
//            } else {
//                if (mid + 1 > x/(mid + 1))
//                    return mid;
//                left = mid + 1;
//            }
//        }
//===================================================
//Use statistics
        if(x < 4) return x == 0 ? 0 : 1;
        int res = 2 * mySqrt(x/4);
        if((res+1) * (res+1) <= x && (res+1) * (res+1) >= 0) return res+1;
        return res;
    }
}
