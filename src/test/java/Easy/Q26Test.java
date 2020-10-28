package Easy;

import org.junit.jupiter.api.Test;

public class Q26Test {
    @Test
    public void removeDuplicates() throws Exception {
        int[] a = new int[]{1,2};
        Q26 q26 = new Q26();
        System.out.println(q26.removeDuplicates(a));
        for(int n:a){
            System.out.print(n + " ");
        }
    }

}