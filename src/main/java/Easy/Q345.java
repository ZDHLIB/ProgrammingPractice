package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q345 {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int left = 0, right = s.length()-1;
        char[] c = s.toCharArray();
        while(left<right){
            while( left < s.length() && !vowels.contains(c[left]) )  left++;
            while( right > left && !vowels.contains(c[right]) )  right--;
            if( left < right ){
                c[left] = (char) (c[left] ^ c[right]);
                c[right] = (char) (c[left] ^ c[right]);
                c[left] = (char) (c[left] ^ c[right]);
                left++;
                right--;
            }
        }
        return new String(c);
    }
}
