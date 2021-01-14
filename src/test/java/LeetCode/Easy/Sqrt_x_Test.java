package LeetCode.Easy;

import org.junit.jupiter.api.Test;
public class Sqrt_x_Test {
    @Test
    public void mySqrt() throws Exception {
        Sqrt_x_ sqrt_x_ = new Sqrt_x_();
        for(int i=5; i<18; i++)
            System.out.println("sqrt("+i+"): " + sqrt_x_.mySqrt(i));
    }

}