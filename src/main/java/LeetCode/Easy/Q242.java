package LeetCode.Easy;

import java.util.Arrays;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] flag = new int[26];
        for(int i = 0; i < s.length(); i++){
            flag[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            flag[t.charAt(i) - 'a']--;
            if(flag[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
