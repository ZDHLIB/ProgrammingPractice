package LeetCode.Easy;

public class Q171 {
    public int titleToNumber(String s) {
        int res = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++){
            res = res * 26 + chs[i]-'A' + 1;
        }
        return res;
    }
}
