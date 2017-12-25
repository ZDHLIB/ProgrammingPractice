package Easy;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        if(nums.length <= 1)  return nums.length;
        for(int i = 1; i < nums.length; i++){
            while(i < nums.length && nums[i] == nums[i-1]){
                i++;
            }
            if(i < nums.length) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
