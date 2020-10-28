package Easy;

import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {
    @Test
    public void thirdMax() throws Exception {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] array = new int[]{2,2,3,1};
        System.out.println(thirdMaximumNumber.thirdMax(array));
    }

}