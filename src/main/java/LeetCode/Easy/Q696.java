package LeetCode.Easy;

public class Q696 {
    public int countBinarySubstrings(String s) {
        int res = 0, prev = 0, cur = 1;
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length()-1; i++){
            if( c[i] != c[i+1] ){
                res += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }else{
                cur++;
            }
        }
        res += Math.min(prev,cur);
        return res;
    }
}
