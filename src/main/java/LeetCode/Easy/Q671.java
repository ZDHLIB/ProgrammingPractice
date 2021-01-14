package LeetCode.Easy;

import java.util.Arrays;

public class Q671 {
    int min = Integer.MAX_VALUE;
    int subMin = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        inOrder(root);
        return subMin;
    }

    private int inOrder(TreeNode root){
        if( root == null ) return Integer.MAX_VALUE;
        int left = inOrder(root.left);
        int right = inOrder(root.right);
        int[] nums = new int[]{root.val, left, right};
        Arrays.sort(nums);
        for(int n : nums){
            min = Math.min(min, n);
            if( n > min ){
                subMin = Math.min(subMin, n);
            }
        }
        return nums[0];
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
