package LeetCode.Easy;

public class Q283 {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while( i < nums.length && j < nums.length ){
            while( i < nums.length && nums[i] != 0 ){
                i++;
            }
            j = i+1;
            while( j < nums.length && nums[j] == 0 ){
                j++;
            }
            if( i < nums.length && j < nums.length ){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }
        }
    }
}
