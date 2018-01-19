package Easy;

public class Q572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return s != null && ( isSubtree(s.left, t) || isSubtree(s.right,t) || preOrder(s, t) );
    }

    private boolean preOrder(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

        if( s.val == t.val ) {
            return preOrder(s.left, t.left) && preOrder(s.right,t.right);
        }else {
            return false;
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
