package LeetCode.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class Q1048 {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        int res = 1;
        int n = words.length;
        int[] dp = new int[n];

        for(int i = 1; i < n; i++){
            for(int j = i-1; j >= 0; j--){
                if(words[i].length() - words[j].length() == 1) {
                    if(isPredecessor(words[j], words[i])){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                        res = Math.max(dp[i] + 1, res);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(words));
        // System.out.println(Arrays.toString(dp));
        return res;
    }

    private boolean isPredecessor(String word1, String word2){
        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if(word1.charAt(i) != word2.charAt(j)) j++;
            else{
                i++;
                j++;
            }
        }
        return i==n1 && (j==n2-1 || j==n2);
    }

    public static void main(String[] args) {
        Q1048 q = new Q1048();
        System.out.println(q.isPredecessor("b", "ab"));
    }
}
