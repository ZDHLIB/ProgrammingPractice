package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("ab,./-sfg"));
    }

}