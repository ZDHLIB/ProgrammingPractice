package LeetCode.Easy;

public class Q387 {
    public int firstUniqChar(String s) {
        int[] hash = new int[26];
        int[] pos = new int[26];
        int res = Integer.MAX_VALUE;
        char[] cc = s.toCharArray();
        for(int i = 0; i < cc.length; i++){
            hash[cc[i]-'a']++;
            pos[cc[i]-'a'] = i;
        }
        for(int i = 0; i < 26; i++){
            if( hash[i] == 1 ){
                res = Math.min(res, pos[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
