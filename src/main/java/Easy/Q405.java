package Easy;

public class Q405 {
    public String toHex(int num) {
        if(num == 0) return "0";
        char[] map = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        while(num != 0){
            res = map[num & 15] + res;
            // '>>>' is used to right-shifted `4` bit positions with zero-extension.
            // The zero-extension will naturally deal with negative number.
            num = num >>> 4;
        }
        return res;
    }
}
