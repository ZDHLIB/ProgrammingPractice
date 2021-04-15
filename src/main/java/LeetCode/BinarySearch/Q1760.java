package LeetCode.BinarySearch;

public class Q1760 {
    public int minimumSize(int[] nums, int maxOperations) {
        int maxPenalty = 0;

        for(int n : nums){
            maxPenalty = Math.max(maxPenalty, n);
        }

        int low = 1, high = maxPenalty;
        while(low <= high) {
            int mid = low + (high - low)/2;

            int operations = 0;
            for(int n : nums) {
                operations += (n - 1) / mid;
            }
            // System.out.print(mid);
            // System.out.print("-");
            // System.out.println(operations);

            if(operations > maxOperations) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
