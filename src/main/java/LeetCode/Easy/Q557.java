package LeetCode.Easy;

public class Q557 {
    public String reverseWords(String s) {
        int i = 0, j = 0, len = s.length();
        char[] chs = s.toCharArray();
        while(i < len){
            while(i < len && chs[i] == ' ') i++;
            j = i;
            while(j < len && chs[j] != ' ') j++;
            j--;
            chs = exchange(chs, i, j);
            i = j + 1;
        }
        return new String(chs);
    }

    private char[] exchange(char[] chs, int i, int j){
        while(i < j){
            chs[i] = (char) (chs[i] ^ chs[j]);
            chs[j] = (char) (chs[i] ^ chs[j]);
            chs[i] = (char) (chs[i] ^ chs[j]);
            i++;
            j--;
        }
        return chs;
    }
}
