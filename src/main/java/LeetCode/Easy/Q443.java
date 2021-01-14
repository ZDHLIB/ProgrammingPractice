package LeetCode.Easy;

public class Q443 {
    public int compress(char[] chars) {
        int n = 1, i = 0, j = 1, res = 0;
        if(chars.length == 1) return 1;
        while(i < chars.length){
            char tmp = chars[i];
            while(j < chars.length && chars[j] == tmp){
                j++;
                n++;
            }
            chars[res++] = chars[i];
            if( n > 1 ){
                String str = String.valueOf(n);
                char[] chs = str.toCharArray();
                for(int k = 0; k < chs.length; k++){
                    chars[res++] = chs[k];
                }
            }
            i = j;
            j = i + 1;
            n = 1;
        }

        for(int m = 0; m < res; m++)  System.out.print(chars[m]);
        return res;
    }
}
