package LeetCode.DynamicProgramming;

public class Q1372 {
    int res = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        solve(root.right, true, 1);
        solve(root.left, false, 1);
        return res;
    }

    // direction: true -> right, false -> left
    private void solve(TreeNode root, boolean direction, int count){

        if(root == null) return;
        res = Math.max(res, count);

        if(direction){
            solve(root.right, direction, 1);
            solve(root.left, !direction, count + 1);
        } else {
            solve(root.right, !direction, count + 1);
            solve(root.left, direction, 1);
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
