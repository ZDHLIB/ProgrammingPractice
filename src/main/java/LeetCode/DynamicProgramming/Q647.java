package LeetCode.DynamicProgramming;

public class Q647 {
    public int countSubstrings(String s) {
        int len = s.length();
        if(len == 0) return 0;
        if(len == 1) return 1;

        int[][] dp = new int[len][len];

        for(int i = 0; i < len; i++) dp[i][i] = 1;

        for(int size = 1; size < len; size++){
            for(int i = 0; i < len-size; i++){
                int j = i + size;
                dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                int g = 0;
                while(i+g <= j-g){
                    if(s.charAt(i+g) != s.charAt(j-g)){
                        break;
                    }
                    g++;
                }
                if(i+g > j-g) dp[i][j]++;
            }
        }
        // for(int[] t : dp){
        //     System.out.println(Arrays.toString(t));
        // }
        return dp[0][len-1];
    }

    public int countSubstrings2(String s) {
        int n = s.length(), ans = 0;

        if (n <= 0)
            return 0;

        boolean[][] dp = new boolean[n][n];

        // Base case: single letter substrings
        for (int i = 0; i < n; ++i, ++ans)
            dp[i][i] = true;

        // Base case: double letter substrings
        for (int i = 0; i < n - 1; ++i) {
            dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
            ans += (dp[i][i + 1] ? 1 : 0);
        }

        // All other cases: substrings of length 3 to n
        for (int len = 3; len <= n; ++len)
            for (int i = 0, j = i + len - 1; j < n; ++i, ++j) {
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                ans += (dp[i][j] ? 1 : 0);
            }

        return ans;
    }
}
