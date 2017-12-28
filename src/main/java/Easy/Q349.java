package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q349 {
    //Hash table, Space O(n), Time O(n);
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int n : nums1){
            s.add(n);
        }
        for(int n : nums2){
            if( s.contains(n) ){
                res.add(n);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int n : res){
            result[i++] = n;
        }
        return result;
    }

    //Sort and two pointers
    public int[] intersection2(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        Set<Integer> res = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0, j = 0; i < len1 && j < len2; ){
            if( nums1[i] < nums2[j] ){
                i++;
            } else if (nums1[i] > nums2[j] ){
                j++;
            } else {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int n : res){
            result[i++] = n;
        }
        return result;
    }

    //Binary search
    public int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Arrays.sort(nums2);
        for(int n : nums1){
            int index = binarySearch(nums2, n);
            if( index != -1 ){
                res.add(n);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int n : res){
            result[i++] = n;
        }
        return result;
    }

    private int binarySearch(int[] nums, int n){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if( nums[mid] == n ){
                return mid;
            }else if( nums[mid] < n ){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
