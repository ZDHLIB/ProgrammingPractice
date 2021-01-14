package LeetCode.Easy;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Q118Test {
    @Test
    public void generate() throws Exception {
        Q118 q118 = new Q118();
        List<List<Integer>> res = q118.generate(6);
        for( List<Integer> r : res){
            for(int n : r){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}