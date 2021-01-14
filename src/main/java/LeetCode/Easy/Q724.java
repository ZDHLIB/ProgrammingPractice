package LeetCode.Easy;

public class Q724 {
    public int pivotIndex(int[] nums) {
        int s = 0, leftSum = 0;
        for(int n : nums){
            s += n;
        }
        for(int i = 0; i < nums.length; i++){
            if( (s-nums[i]-leftSum) == leftSum ){
                return i;
            }else{
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
