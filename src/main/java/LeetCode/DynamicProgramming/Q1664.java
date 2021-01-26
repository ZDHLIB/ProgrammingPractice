package LeetCode.DynamicProgramming;

public class Q1664 {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;

        int evenSum = 0, oddSum = 0;
        for(int i = n-1; i >= 0; i--){
            //even
            if(i%2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int i = 0, removeIndex = 0;
        int pastOddSum = 0;
        int pastEvenSum = 0;
        while(i < n){
            if(i%2 == 0){
                evenSum -= nums[i];
                if(pastEvenSum + oddSum == pastOddSum + evenSum){
                    removeIndex++;
                }
                pastEvenSum  += nums[i];
            } else {
                oddSum -= nums[i];
                if(pastOddSum + evenSum == pastEvenSum + oddSum){
                    removeIndex++;
                }
                pastOddSum  += nums[i];
            }
            i++;
        }


        return removeIndex;
    }
}
