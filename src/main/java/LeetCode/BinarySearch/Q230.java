package LeetCode.BinarySearch;

import java.util.ArrayList;

public class Q230 {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inOrder(root, arr);
        return arr.get(k-1);
    }

    public void inOrder(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return;

        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }

    public static class TreeNode {
        int val;
        Q230.TreeNode left;
        Q230.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Q230.TreeNode left, Q230.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
