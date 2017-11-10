package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdMaximumNumberTest {
    @Test
    public void thirdMax() throws Exception {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] array = new int[]{2,2,3,1};
        System.out.println(thirdMaximumNumber.thirdMax(array));
    }

}