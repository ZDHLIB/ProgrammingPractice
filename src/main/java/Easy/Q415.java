package Easy;

public class Q415 {
    public String addStrings(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        char[] chs1 = num1.toCharArray();
        char[] chs2 = num2.toCharArray();
        int carry = 0;
        int lenMin = Math.min(chs1.length,chs2.length);
        int lenMax = Math.max(chs1.length,chs2.length);
        int i = 0;
        StringBuilder res = new StringBuilder();
        for(;i < lenMin;i++){
            int a = chs1[i] - '0';
            int b = chs2[i] - '0';
            a = a + b + carry;
            b = a % 10;
            carry = a / 10;
            res.append( b );
        }
        if( chs1.length > chs2.length ) {
            for (; i < lenMax; i++) {
                int a = chs1[i] - '0';
                a = a + carry;
                carry = a / 10;
                a = a % 10;
                res.append( a );
            }
        } else {
            for (; i < lenMax; i++) {
                int a = chs2[i] - '0';
                a = a + carry;
                carry = a / 10;
                a = a % 10;
                res.append( a );
            }
        }
        if( carry != 0 ){
            res.append( carry );
        }
        return res.reverse().toString();
    }

    public String addStrings2(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        char[] chs1 = num1.toCharArray();
        char[] chs2 = num2.toCharArray();
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        for(int i = len1-1, j = len2-1; i >= 0 || j >= 0 || carry > 0; i--, j--){
            int a = i>=0 ? chs1[i] - '0' : 0;
            int b = j>=0 ? chs2[j] - '0' : 0;
            res.append( (a + b + carry) % 10 );
            carry = (a + b + carry) / 10;
        }
        return res.reverse().toString();
    }

}
