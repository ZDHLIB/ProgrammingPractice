package LeetCode.Easy;

public class Q9 {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        while(reverse < x){
            reverse += reverse * 10 + x % 10;
            x /= 10;
        }
        return x/10 == reverse || reverse == x;
    }
}
