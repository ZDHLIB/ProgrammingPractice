package Easy;

public class Q38 {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        while(n-->1){
            StringBuilder sb = res;
            res = new StringBuilder();
            char[] c = sb.toString().toCharArray();
            int j = 1;
            for(int i = 0; i < c.length-1; i++){
                if( c[i] == c[i+1] ) {
                    j++;
                }else{
                    res.append(j).append(c[i]);
                    j = 1;
                }
            }
            res.append(j).append(sb.charAt(sb.length()-1));
        }
        return res.toString();
    }
}
