package LeetCode.Easy;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {

        int len = nums.length;

        if(len == 1)
            return nums[0];
        else if(len == 2)
            return nums[1]>nums[0] ? nums[1] : nums[0];

        Integer first = null;
        Integer second = null;
        Integer third = null;
        for(int i = 0; i < len; i++){
            if( ( first != null && nums[i] == first) || (second != null && nums[i] == second) || (third != null && nums[i] == third) )
                continue;
            if(first == null || nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            } else if(second == null || nums[i] > second){
                third = second;
                second = nums[i];
            } else if(third == null || nums[i] > third){
                third = nums[i];
            }
        }
        if( third != null ){
            return third;
        } else {
            return first;
        }
    }
}
