package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int n = 0;
        for(String str : list1){
            hashMap1.put(str, n++);
        }
        n = 0;
        for(String str : list2){
            hashMap2.put(str, n++);
        }
        int res = Integer.MAX_VALUE;
        List<String> resStr = new ArrayList<>();
        for( Map.Entry entry : hashMap1.entrySet() ){
            String key = (String) entry.getKey();
            if( hashMap2.containsKey(key) && hashMap1.get(key) + hashMap2.get(key) < res ) {
                res = hashMap1.get(key) + hashMap2.get(key);
                resStr.clear();
                resStr.add(key);
            }else if (hashMap2.containsKey(key) && hashMap1.get(key) + hashMap2.get(key) == res){
                resStr.add(key);
            }
        }
        return resStr.toArray(new String[0]);
    }
}
