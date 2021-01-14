package LeetCode.Easy;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        k = k%(n+1);
        int[] tmp = new int[k];
        for(int i = 0; i < k; i++ ){
            tmp[i] = nums[n-k+i+1];
        }
        for(int i = 0; i <= n-k; i++){
            nums[n-i] = nums[n-k-i];
        }
        for(int i = 0; i < k; i++){
            nums[i] = tmp[i];
        }
        return;
    }

    public static void main(String args[]){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        RotateArray r = new RotateArray();
        r.rotate(nums, 9);
        for(int n:nums)
            System.out.print(n+" ");
    }
}
