package Easy;

public class Q400 {
    public int findNthDigit(int n) {
        int len = 1, res = 0;
        long level = 9;
        while( n > len * level ){
            System.out.println(n);
            n -= len * level;
            len++;
            level *= 10;
        }
        int m = (int) (Math.pow(10, len-1) + (n-1)/len);
        System.out.println(m + " " + (n-1)%len);
        return String.valueOf(m).charAt((n-1)%len)-'0';
    }
}
