package LeetCode.Easy;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        if(m==0){
            for(int i = 0; i <= len; i++){
                nums1[i] = nums2[i];
            }
            return;
        }

        int k = n-1;
        for(int i = len, j = m-1; k >= 0 && j >= 0 && i >= 0; ){
            if(nums1[j] > nums2[k]){
                nums1[i--] = nums1[j];
                nums1[j] = -nums1[j--];
            } else if(nums1[j] < nums2[k]){
                nums1[i--] = nums2[k--];
            } else {
                nums1[i--] = nums1[j];
                nums1[j] = -nums1[j--];
                nums1[i--] = nums2[k--];
            }
        }
        while(k>=0){
            nums1[k] = nums2[k];
            k--;
        }
    }
}
