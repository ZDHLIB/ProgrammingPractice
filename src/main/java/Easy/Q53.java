package Easy;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public int maxSubArray2(int[] nums) {
        int max_cur = Integer.MIN_VALUE, maxSoFar = Integer.MIN_VALUE;
        int[] maxRes = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if( max_cur < 0 ){
                max_cur = nums[i];
            }else {
                max_cur += nums[i];
            }
            maxSoFar = Math.max(maxSoFar, max_cur);
            maxRes[i] = maxSoFar;
        }
        return maxRes[nums.length-1];
    }
}
