package LeetCode.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Q658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        int pos = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < x){
                low = mid + 1;
                if(x - arr[mid] < pos) {
                    pos = mid;
                }
            } else if(arr[mid] > x) {
                high = mid - 1;
                if(arr[mid] - x < pos) {
                    pos = mid;
                }
            } else {
                pos = mid;
                break;
            }
        }
        System.out.println(pos);


        low = Math.max(0, pos - k);
        high = Math.min(len-1, pos + k);

        while(high - low >= k) {
            if( high >= 0 && arr[high] - x >= x - arr[low] ) {
                high--;
            } else if ( low < len && arr[high] - x < x - arr[low] ) {
                low++;
            }
        }

        for(int i = low; i <= high; i++){
            res.add(arr[i]);
        }
        return res;

    }
}
