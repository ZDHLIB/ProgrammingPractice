package LeetCode.Easy;

public class Q344 {
    public String reverseString(String s) {
        byte[] b = s.getBytes();
        int left = 0, right = s.length()-1;
        while(left < right){
//            byte tmp = b[left];
//            b[left] = b[right];
//            b[right] = tmp;
            b[left] = (byte) (b[left] ^ b[right]);
            b[right] = (byte) (b[left] ^ b[right]);
            b[left] = (byte) (b[left] ^ b[right]);
            left++;
            right--;
        }
        return new String(b);
    }
}
