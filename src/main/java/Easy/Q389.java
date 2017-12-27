package Easy;

public class Q389 {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(int i = 0; i < s.length(); i++){
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        return (char)(res^t.charAt(t.length()-1));
    }
}
