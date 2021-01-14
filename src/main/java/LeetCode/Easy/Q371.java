package LeetCode.Easy;

public class Q371 {
    public int getSum(int a, int b) {
        int carry = 0, res = 0, p = 0;
        while(a != 0 || b != 0){
            res |= ( (a & 1) ^ (b & 1) ^ carry ) << p;
            if(carry == 1) {
                carry = ((a & 1) | (b & 1)) & carry;
            }else{
                carry = ((a & 1) & (b & 1)) | carry;
            }
            a >>= 1;
            b >>= 1;
            p++;
        }
        res |= (carry<<p);
        return res;

//        return b == 0 ? a : getSum(a^b, (a&b)<<1);
    }
}
