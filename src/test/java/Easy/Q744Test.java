package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q744Test {
    @Test
    public void nextGreatestLetter() throws Exception {
        char[] a = new char[]{'c','f','j'};
        Q744 q744 = new Q744();
        System.out.println(q744.nextGreatestLetter(a, 'a'));
    }

}