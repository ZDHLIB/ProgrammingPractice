package LeetCode.Easy;

import org.junit.jupiter.api.Test;

public class Q682Test {
    @Test
    public void calPoints() throws Exception {
        String[] opr = new String[]{"5","-2","4","C","D","9","+","+"};
        Q682 q682 = new Q682();
        System.out.print(q682.calPoints(opr));
    }

}