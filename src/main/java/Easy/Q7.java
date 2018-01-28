package Easy;

public class Q7 {
    public int reverseInteger(int n){
        int res = 0;
        while(n != 0){
            int tail = n % 10;
            res = res * 10 + tail;
            if( (res%10) != tail ) return 0;
            n /= 10;
        }
        return res;
    }
}
