package Easy;

public class Q434 {
    public int countSegments(String s) {
        int res = 0;
        char tmp = ' ';
        char[] chs = s.toCharArray();
        for(char ch : chs){
            if( ch == ' ' && ch != tmp ){
                res++;
                tmp = ch;
            } else if( ch != ' ' ){
                tmp = ch;
            }
        }
        return tmp != ' ' ? res+1 : res;
    }
}
