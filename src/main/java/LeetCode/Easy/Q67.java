package LeetCode.Easy;

public class Q67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while( i >= 0 && j >= 0 ){
            int tmp = carry;
            if( i >= 0 ){
                tmp += a.charAt(i--) - '0';
            }
            if( j >= 0 ){
                tmp += b.charAt(j--) - '0';
            }
            res.append( tmp % 2 );
            carry = tmp / 2;
        }
        if( carry != 0 ){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
