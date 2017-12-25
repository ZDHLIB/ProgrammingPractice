package Easy;

public class Q27 {
    public int removeElement(int[] nums, int val) {
        int k = 0, p = 0;
        while(p<nums.length){
            while(k < nums.length && nums[k]!=val){
                k++;
            }
            p = k+1;
            while(p<nums.length && nums[p]==val){
                p++;
            }
            if(p<nums.length){
                int tmp = nums[k];
                nums[k] = nums[p];
                nums[p] = tmp;
            }
        }
        return k;
    }
}
