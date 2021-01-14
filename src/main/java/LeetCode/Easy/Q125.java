package LeetCode.Easy;

public class Q125 {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right){
            if( !Character.isLetterOrDigit(c[left]) ){
                left++;
            }else if( !Character.isLetterOrDigit(c[right]) ){
                right--;
            }else if( Character.toLowerCase(c[left]) == Character.toLowerCase(c[right]) ){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
