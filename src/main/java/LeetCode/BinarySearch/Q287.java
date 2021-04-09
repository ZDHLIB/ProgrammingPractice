package LeetCode.BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class Q287 {
    public int findDuplicate(int[] nums) {
        int first = nums[0], second = nums[0];
        do {
            first = nums[first];
            second = nums[nums[second]];
        }while(first != second);

        first = nums[0];
        while(first != second) {
            first = nums[first];
            second = nums[second];
        }
        return first;
    }

    public int findDuplicate2(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
