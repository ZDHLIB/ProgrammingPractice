package Easy;

public class Q581 {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, start = 0, end = 0, maxIndex = 0, minIndex = len;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < len-1; i++){
            if(nums[i] > nums[i+1]){
                start = i;
                break;
            }
        }
        for(int i = len-1; i > 0; i--){
            if(nums[i] < nums[i-1]){
                end = i;
                break;
            }
        }
        for(int i = start; i <= end; i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        for(int i = 0; i < start; i++){
            if(nums[i] > min) {
                minIndex = i;
                break;
            }
        }
        start = Math.min(start, minIndex);
        for(int i = end+1; i < len; i++){
            if(nums[i] < max)
                maxIndex = i;
        }
        end = Math.max(end, maxIndex);
        return end==start?0:end-start+1;
    }
}
