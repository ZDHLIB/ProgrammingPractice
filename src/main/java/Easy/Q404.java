package Easy;

public class Q404 {
    int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        order(root.left,true);
        order(root.right,false);
        return res;
    }

    private void order(TreeNode root, boolean isLeft) {
        if(root == null) return;
        order(root.right, false);
        order(root.left, true);
        if( root.left ==  null && root.right == null && isLeft ) {
            res += root.val;
            return;
        }

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
