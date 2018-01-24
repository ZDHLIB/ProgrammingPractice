package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class Q447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        int len = points.length;
        for(int i = 0; i < len; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < len; j++){
                if(i == j) continue;
                int dis = (int) distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if(!map.containsKey(dis)) {
                    map.put(dis, 1);
                }else{
                    res += map.get(dis) * 2;
                    map.put(dis, map.get(dis) + 1);
                }
            }
        }
        return res;
    }

    private double distance(int x1, int y1, int x2, int y2){
        return Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
    }
}
