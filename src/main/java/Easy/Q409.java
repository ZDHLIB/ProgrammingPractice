package Easy;

public class Q409 {
    public int longestPalindrome(String s) {
        char[] chs = s.toCharArray();
        int res = 0;
        int[] set = new int[256];
        for(char ch : chs){
            set[ch]++;
        }
        for(int n : set){
            res += n / 2 * 2;
            if( res % 2 == 0 && n % 2 == 1 ){
                res++;
            }
        }
        return res;
    }
}
