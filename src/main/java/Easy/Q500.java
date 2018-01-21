package Easy;

import java.util.*;

public class Q500 {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        Set<Character> line1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> line2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> line3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        for(int k = 0; k < words.length; k++){
            int i = 0;
            char[] chs = words[k].toCharArray();
            if(line1.contains(chs[0])){
                for(i = 1; i < chs.length; i++){
                    if(!line1.contains(chs[i])){
                        break;
                    }
                }
            } else if (line2.contains(chs[0])){
                for(i = 1; i < chs.length; i++){
                    if(!line2.contains(chs[i])){
                        break;
                    }
                }
            } else {
                for(i = 1; i < chs.length; i++){
                    if(!line3.contains(chs[i])){
                        break;
                    }
                }
            }
            if( i == chs.length ){
                res.add(words[k]);
            }
        }
        return res.toArray(new String[0]);
    }
}
