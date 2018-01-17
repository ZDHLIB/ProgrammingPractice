package Easy;

public class Q680 {
    public boolean validPalindrome(String s) {
        char[] chs = s.toCharArray();
        if(chs.length <= 2) return true;
        int i = 0, j = chs.length - 1;
        while(i < j){
            if( chs[i] != chs[j] ){
                return check(chs, i+1, j) && check(chs, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean check(char[] chs, int i, int j){
        while(i < j){
            if( chs[i++] != chs[j--] ) return false;
        }
        return true;
    }
}
