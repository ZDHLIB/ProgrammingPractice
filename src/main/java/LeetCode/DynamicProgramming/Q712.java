package LeetCode.DynamicProgramming;

public class Q712 {
    public int minimumDeleteSum(String s1, String s2) {
        int ns1 = s1.length();
        int ns2 = s2.length();
        int[][] dp = new int[ns1+1][ns2+1];

        // if s2 == ""
        for(int i = ns1-1; i >= 0; i--){
            dp[i][ns2] = dp[i+1][ns2] + s1.codePointAt(i);
        }

        // if s1 == ""
        for(int j = ns2-1; j >= 0; j--){
            dp[ns1][j] = dp[ns1][j+1] + s2.codePointAt(j);
        }

        for(int i = ns1-1; i >= 0; i--){
            for(int j = ns2-1; j >= 0; j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.min(dp[i+1][j] + s1.charAt(i),
                            dp[i][j+1] + s2.charAt(j));
                }
            }
        }
        return dp[0][0];
    }
}
