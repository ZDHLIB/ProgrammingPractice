package LeetCode.BinarySearch;

public class Q875 {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        int min = 1;
        int max = 1_000_000_000;

        while(min < max) {
            int mid = min + (max-min)/2;
            int count = countHours(piles, h, mid);
            if(count <= h) {
                max = mid;
            } else if(count > h){
                min = mid + 1;
            }
        }
        return min;
    }

    private int countHours(int[] piles, int h, int k){
        int count = 0;
        for(int p : piles){
            count += (p-1)/k + 1;
        }
        return count;
    }
}
