package LeetCode.Easy;

public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, tmp = 0;
        for(int n : nums){
            if(n == 1){
                tmp++;
                res = Math.max(res, tmp);
            }else{
                tmp = 0;
            }
        }
        return res;
    }
}
