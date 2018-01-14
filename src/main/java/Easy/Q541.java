package Easy;

public class Q541 {
    public String reverseStr(String s, int k) {
        char[] chs = s.toCharArray();
        int len = chs.length, i = 0, j;
        if(len < k){
            j = len - 1;
            chs = exchange(chs, i, j);
        }else if( len >= k && len < 2*k ){
            j = k-1;
            chs = exchange(chs, i, j);
        }else {
            j = k-1;
            while(i < len){
                chs = exchange(chs, i, j);
                i += 2*k;
                j = i + k - 1 < len ? i + k - 1 : len - 1;
            }
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
