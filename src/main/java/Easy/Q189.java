package Easy;

public class Q189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int prev = 0, next = 0, count = 0;
        k = k%len;
        for(int start = 0; count < len; start++){
            int current = start;
            prev = nums[start];
            do{
                next = (current + k) % len;
                int tmp = nums[next];
                nums[next] = prev;
                prev = tmp;
                current = next;
                count++;
            }while(start != current);
        }
    }
}
