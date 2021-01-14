package LeetCode.Easy;

public class Q687 {
    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        getDepth(root);
        return res;
    }

    private int getDepth(TreeNode root){
        if(root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int leftDepth = 0, rightDepth = 0;
        if( root.left != null && root.left.val == root.val ){
            leftDepth = left + 1;
        }
        if( root.right != null && root.right.val == root.val ) {
            rightDepth = right + 1;
        }
        res = Math.max(res, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth);
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
