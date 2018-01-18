package Easy;

public class Q437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return getSum(root, sum) + pathSum(root.left,sum) + pathSum(root.right, sum);
    }

    private int getSum(TreeNode root, int sum){
        if( root == null ) return 0;
        if( root.val == sum ) {
            return 1 + getSum(root.left, sum - root.val) + getSum(root.right, sum - root.val);
        } else {
            return getSum(root.left, sum - root.val) + getSum(root.right, sum - root.val);
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
