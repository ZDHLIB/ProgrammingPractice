package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if( s == null || p == null || s.length() < p.length() ) return res;
        int[] pSet = new int[26];
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        for(char ch : pp) pSet[ch-'a']++;

        int n = 0, k = 0;
        while(n < s.length() - p.length() + 1){
            int[] tmpSet = new int[26];
            for(int i = n; i < n + p.length(); i++){
                tmpSet[ss[i]-'a']++;
            }
            for(k = 0; k < 26; k++){
                if( tmpSet[k] != pSet[k] ){
                    break;
                }
            }
            if( k == 26 ) res.add(n);
            n++;
        }
        return res;
    }
}
