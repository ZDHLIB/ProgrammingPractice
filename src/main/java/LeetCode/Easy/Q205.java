package LeetCode.Easy;

public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256];
        int[] s2 = new int[256];
        for(int i = 0; i < s.length(); i++){
            if( s1[s.charAt(i)] != s2[t.charAt(i)] ) return false;
            s1[s.charAt(i)]++;
            s2[t.charAt(i)]++;
        }
        return true;
    }
}
