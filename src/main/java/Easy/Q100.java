package Easy;

public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        else if(p.val == q.val) {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        else {
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
