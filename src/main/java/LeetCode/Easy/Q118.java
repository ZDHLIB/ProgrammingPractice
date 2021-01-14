package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List< List<Integer> > generate(int numRows) {
        List< List<Integer> > res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        res.add(r1);
        for(int i = 1; i < numRows; i++){
            List<Integer> r = new ArrayList<>();
            r.add(1);
            for(int j = 1; j < i; j++){
                r.add( res.get(i-1).get(j-1) + res.get(i-1).get(j) );
            }
            r.add(1);
            res.add(r);
        }
        return res;
    }
}
