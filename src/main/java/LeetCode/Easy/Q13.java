package LeetCode.Easy;

import java.util.HashMap;

public class Q13 {
    private static HashMap<Character, Integer> tag = new HashMap<>();

    static{
        tag.put('I',1);
        tag.put('V',5);
        tag.put('X',10);
        tag.put('L',50);
        tag.put('C',100);
        tag.put('D',500);
        tag.put('M',1000);
    }

    public int romanToInt(String s) {
        char[] chs = s.toCharArray();
        if(s.length() == 1) return tag.get(chs[0]);
        int res = 0;
        for(int i = 0; i < chs.length-1; i++){
            if( tag.get(chs[i+1]) > tag.get(chs[i]) ){
                res -= tag.get(chs[i]);
            }else{
                res += tag.get(chs[i]);
            }
        }
        res += tag.get(chs[chs.length-1]);
        return res;
    }

}
