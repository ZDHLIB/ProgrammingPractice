package Easy;

import java.util.HashMap;

public class Q551 {
    public boolean checkRecord(String s) {
        int A = 0, L = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++){
            switch (chs[i]){
                case 'A':
                    A++;
                    if( A > 1 ) return false;
                    break;
                case 'L':
                    L++;
                    if( i > 1 && chs[i-1] == 'L' && chs[i-2] == 'L' ){
                        return false;
                    }
            }
        }

        return true;
    }
}
