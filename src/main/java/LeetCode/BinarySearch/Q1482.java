package LeetCode.BinarySearch;

public class Q1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int n : bloomDay){
            low = Math.min(low, n);
            high = Math.max(high, n);
        }

        int res = -1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            boolean[] cache = new boolean[bloomDay.length];
            for(int i = 0; i < bloomDay.length; i++) {
                if(bloomDay[i] <= mid) {
                    cache[i] = true;
                }
            }
            if(isPossible(cache, m, k)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            // System.out.println(mid);

        }
        return res;
    }

    private boolean isPossible(boolean[] cache, int m, int k) {
        int count = 0;
        for(int i = 0; i < cache.length; i++){
            if(m == 0) return true;
            if(cache[i]) {
                count++;
                if(count == k) {
                    m--;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return m <= 0;
    }
}
