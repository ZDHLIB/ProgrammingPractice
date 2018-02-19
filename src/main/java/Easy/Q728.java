package Easy;

import java.util.ArrayList;
import java.util.List;

public class Q728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int n = left; n <= right; n++){
            int num = n;
            while(num!=0){
                if( (num%10) == 0 || n%(num%10) != 0 ){
                    break;
                }
                num /= 10;
            }
            if( num == 0 ){
                res.add(n);
            }
        }
        return res;
    }
}
