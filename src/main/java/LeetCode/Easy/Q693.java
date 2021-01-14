package LeetCode.Easy;

public class Q693 {
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            int b = n & 1;
            n = n>>1;
            if( b == (n&1) ){
                return false;
            }
        }
        return true;
    }
}
