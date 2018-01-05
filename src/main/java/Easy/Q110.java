package Easy;

public class Q110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftDepth = dfs(root.left) + 1;
        int rightDepth = dfs(root.right) + 1;
        if(leftDepth == 0 || rightDepth == 0) {
            return false;
        } else if(Math.abs(dfs(root.left)-dfs(root.right)) <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int leftDepth = dfs(root.left) + 1;
        int rightDepth = dfs(root.right) + 1;
        if(leftDepth == 0 || rightDepth == 0
                || Math.abs(dfs(root.left)-dfs(root.right)) > 1) {
            return -1;
        }
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
