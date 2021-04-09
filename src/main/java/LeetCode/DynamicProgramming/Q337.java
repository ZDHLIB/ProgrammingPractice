package LeetCode.DynamicProgramming;

public class Q337 {
    public int rob(TreeNode root) {
        if(root == null) return 0;
        int[] res = dp(root);
        return Math.max(res[0], res[1]);
    }

    public int[] dp(TreeNode root) {
        if(root == null) return new int[2];

        int[] val_left = dp(root.left);
        int[] val_right = dp(root.right);

        int[] values = new int[2];
        values[0] = root.val + val_left[1] + val_right[1];
        values[1] = Math.max(val_left[0], val_left[1]) + Math.max(val_right[0], val_right[1]);
        return values;
    }

    public static class TreeNode {
        int val;
        Q337.TreeNode left;
        Q337.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Q337.TreeNode left, Q337.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
