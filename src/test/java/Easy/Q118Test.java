package Easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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