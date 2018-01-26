package Easy;

public class Q453 {
    public int minMoves(int[] nums) {
        int res = 0, minValue = Integer.MAX_VALUE;
        for(int n : nums) minValue = Math.min(minValue, n);
        for(int n : nums){
            res += n - minValue;
        }
        return res;
    }
}
