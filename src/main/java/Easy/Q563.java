package Easy;

public class Q563 {
    private Integer res = 0;

    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        getTilt(root);
        return res;
    }

    private int getTilt(TreeNode root){
        if( root == null )  return 0;
        int left  = getTilt(root.left);
        int right = getTilt(root.right);
        res += Math.abs(left - right);
        return left + right + root.val;
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
