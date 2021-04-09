package LeetCode.BinarySearch;

public class Q1011 {
    public int shipWithinDays(int[] weights, int D) {
        int leastCapacity = 0, highestCapacity = 0;
        for(int w : weights) {
            leastCapacity = Math.max(leastCapacity, w);
            highestCapacity += w;
        }
        while(leastCapacity <= highestCapacity) {
            int mid = leastCapacity + (highestCapacity - leastCapacity) / 2;
            int days = shipDays(mid, weights);
            if(days <= D) {
                highestCapacity = mid - 1;
            } else {
                leastCapacity = mid + 1;
            }
        }
        return leastCapacity;
    }

    private int shipDays(int capacity, int[] weights){
        int days = 1, tmpWeight = 0;
        for(int w : weights) {
            tmpWeight += w;
            if(tmpWeight > capacity) {
                tmpWeight = w;
                days++;
            }
        }
        return days;
    }
}
