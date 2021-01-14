package LeetCode.Easy;

class NonDecreasingArray {
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

    public static void main(String [] args){
        int[] nums = new int[]{3,4,2,3};
        NonDecreasingArray s = new NonDecreasingArray();
        System.out.println(s.checkPossibility(nums));
    }
}
