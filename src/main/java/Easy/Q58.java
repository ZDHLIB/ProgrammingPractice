package Easy;

public class Q58 {
    public int lengthOfLastWord(String s) {
        char[] c = s.toCharArray();
        int res = 0;
        char tmp = ' ';
        for(int i = c.length-1; i >= 0; i--){
            if(c[i] == tmp && tmp == ' ') {
                continue;
            }else if(c[i] == ' ') {
                return res;
            }else{
                tmp = c[i];
                res++;
            }
        }
        return res;
    }
}
