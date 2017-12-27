package Easy;

public class Q190 {
    public int reverseBits(int n) {
//        int len = 31, res = 0;
//        for(int i = 0; i <= len; i++){
//            res = res << 1;
//            res |= n & 1;
//            System.out.println(res);
//            n = n >>> 1;
//        }
//        return res;
        int res = n;
        res = (res >> 16) | (res << 16);
        res = ((res & 0xff00ff00) >> 8) | ((res & 0x00ff00ff) << 8);
        res = ((res & 0xf0f0f0f0) >> 4) | ((res & 0x0f0f0f0f) << 4);
        res = ((res & 0xcccccccc) >> 2) | ((res & 0x33333333) << 2);
        res = ((res & 0xaaaaaaaa) >> 1) | ((res & 0x55555555) << 1);
        return res;
    }
}
