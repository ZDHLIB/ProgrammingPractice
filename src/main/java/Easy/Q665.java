package Easy;

public class Q665 {
    public boolean checkPossibility(int[] nums) {
        int flag = -1;
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            if(nums[i] > nums[i+1]){
                if (flag != -1){
                    return false;
                }
                flag = i;
            }
        }
        return (flag < 1 || flag == len-2 || nums[flag-1] <= nums[flag+1] || nums[flag] <= nums[flag+2]);
    }
}
