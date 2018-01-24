package Easy;

import java.util.HashMap;

public class Q290 {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");
        if( patterns.length != strs.length ) return false;
        for(int i = 0; i < strs.length; i++){
            if( !map.containsKey(patterns[i]) && !map2.containsKey(strs[i]) ){
                map.put(patterns[i], strs[i]);
                map2.put(strs[i], patterns[i]);
                continue;
            }

            if( map.containsKey(patterns[i]) && !map.get(patterns[i]).equals(strs[i]) ){
                return false;
            }
            if( map2.containsKey(strs[i]) && !map.get(strs[i]).equals(patterns[i]) ){
                return false;
            }
        }
        return true;
    }
}
