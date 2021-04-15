package LeetCode.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int lenA = A.length;
        int lenB = B.length;
        int lenC = C.length;
        int lenD = D.length;
        int res = 0;

        ArrayList<Integer> arrA = new ArrayList<>();
        for(int a = 0; a < lenA; a++){
            for(int b = 0; b < lenB; b++){
                arrA.add(A[a] + B[b]);
            }
        }
        Collections.sort(arrA);
        System.out.println(Arrays.toString(arrA.toArray()));

        ArrayList<Integer> arrB = new ArrayList<>();
        for(int c = 0; c < lenC; c++){
            for(int d = 0; d < lenD; d++){
                arrB.add(C[c] + D[d]);
            }
        }
        Collections.sort(arrB);
        System.out.println(Arrays.toString(arrB.toArray()));

        for(int a : arrA){
            int count = binarySearch(arrB, -a);
            System.out.println(count);
            if(count != -1) res += count;
        }
        return res;
    }

    private int binarySearch(ArrayList<Integer> arr, int target) {
        int low = 0;
        int high = arr.size();
        int count = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) < target) {
                low = mid + 1;
            } else if(arr.get(mid) > target) {
                high = mid - 1;
            } else {
                for(int i = mid; i < arr.size(); i++){
                    if(arr.get(i) == target) count++;
                    else break;
                }
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q454 q = new Q454();
        int[] A = new int[]{-1,-1};
        int[] B = new int[]{-1,1};
        int[] C = new int[]{-1,1};
        int[] D = new int[]{1,-1};
        q.fourSumCount(A,B,C,D);
    }
}
