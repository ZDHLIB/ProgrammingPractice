package LeetCode.BinarySearch;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 */
public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int start = -1, end = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            } else if(nums[mid] >= target) {
                high = mid - 1;
                if(nums[mid] == target) {
                    start = mid;
                }
            }
        }

        low = 0;
        high = len - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] <= target) {
                low = mid + 1;
                if(nums[mid] == target) {
                    end = mid;
                }
            } else {
                high = mid - 1;
            }
        }
        return new int[]{start, end};
    }
}
