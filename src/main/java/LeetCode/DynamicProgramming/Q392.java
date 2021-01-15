package LeetCode.DynamicProgramming;

public class Q392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int lenS = s.length(), lenT = t.length();
        if(lenS > lenT) return false;
        if(lenS == 0) return true;

        while(j < lenT){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
            if(i == lenS) return true;
        }
        return false;
    }
}
