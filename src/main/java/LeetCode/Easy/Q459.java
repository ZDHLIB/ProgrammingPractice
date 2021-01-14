package LeetCode.Easy;

public class Q459 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1)  return true;
        if(s.length() == 0)  return false;
        char[] chs = s.toCharArray();
        int[] next = new int[chs.length];
        int len = chs.length;
        next[0] = -1;
        int i = -1, j = 0;
        while(j < chs.length-1){
            if(i==-1 || chs[i] == chs[j]){
                next[j++] = ++i;
            }else{
                i = next[i];
            }
        }
        for(char ch : chs)  System.out.print(ch + " ");
        System.out.println();
        for(int k : next)  System.out.print(k + " ");
        return next[len-1] != 0 && ( ( next[len-1] % (len - next[len-1]) ) == 0 );
    }


    public boolean repeatedSubstringPattern2(String s) {
        if(s.length() == 1)  return false;
        if(s.length() == 0)  return false;
        char[] chs = s.toCharArray();
        int[] next = new int[chs.length];
        int len = chs.length;

        int i = 0, j = 1;
        while(j < chs.length){
            if(chs[i] == chs[j]){
                next[j++] = ++i;
            }else if( i == 0 ){
                j++;
            }else{
                i = next[i-1];
            }
        }


        for(char ch : chs)  System.out.print(ch + " ");
        System.out.println();
        for(int k : next)  System.out.print(k + " ");
        return next[len-1] != 0 && ( ( next[len-1] % (len - next[len-1]) ) == 0 );
    }
}
