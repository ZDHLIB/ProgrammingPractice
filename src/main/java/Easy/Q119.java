package Easy;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if(rowIndex <= 0){
            return res;
        }
        res.add(1);
        for(int i = 1; i <= rowIndex; i++){
            double lastValue = res.get(i-1);
            int lastColumn = i-1;
            double tmp = lastValue * (rowIndex - lastColumn) / (lastColumn + 1);
            res.add((int)tmp);
        }
        return res;
    }
}
