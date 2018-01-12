package Easy;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rN = ransomNote.toCharArray();
        char[] mg = magazine.toCharArray();
        int[] flag = new int[26];
        for(char ch : mg){
            flag[ch-'a']++;
        }
        for(char ch : rN){
            flag[ch-'a']--;
            if( flag[ch-'a'] < 0 ){
                return false;
            }
        }
        return true;
    }
}
