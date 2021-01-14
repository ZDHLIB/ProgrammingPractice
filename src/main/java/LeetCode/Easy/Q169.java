package LeetCode.Easy;

public class Q169 {
    public int majorityElement(int[] nums) {
        int res = 0, major = 0;
        for(int n : nums){
            if(res == 0){
                major = n;
            }
            res += (n == major)?1:-1;
        }
        return major;
    }
}
