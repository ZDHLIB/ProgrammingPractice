package LeetCode.Easy;

public class Q66 {
    public int[] plusOne(int[] digits) {
        int carray = 0;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            carray = 1;
        }
        if(carray == 1){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int i = 0; i < digits.length; i++){
                res[i+1] = digits[i];
            }
            return res;
        }
        return digits;
    }
}
