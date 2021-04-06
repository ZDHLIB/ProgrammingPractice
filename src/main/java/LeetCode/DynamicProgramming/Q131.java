package LeetCode.DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        parsePalindromes(0, s, res, new ArrayList<String>(), dp);
        return res;
    }

    public void parsePalindromes(int start, String s,  List<List<String>> res, ArrayList<String> palin, boolean[][] dp) {
        if(start >= s.length()) res.add(new ArrayList<>(palin));
        for(int end = start; end < s.length(); end++){
            String str = s.substring(start, end + 1);
            if( (s.charAt(start) == s.charAt(end)) && (end - start <= 2 || dp[start+1][end-1]) ){
                dp[start][end] = true;
                palin.add(str);
                parsePalindromes(end + 1, s, res, palin, dp);
                palin.remove(palin.size() - 1);
            }
        }
    }

}
