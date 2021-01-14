package LeetCode.Easy;

public class Q168 {
    public String convertToTitle(int n) {
        String tag = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder res = new StringBuilder();
        while(n>0){
            res.append(tag.charAt((n-1)%26));
            n = (n-1)/26;
        }
        return res.reverse().toString();
    }
}
