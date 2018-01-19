package Easy;

import java.util.HashSet;
import java.util.Set;

public class Q653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s = new HashSet<>();
        return find(root, k, s);
    }

    private boolean find(TreeNode root, int k, Set<Integer> s){
        if( root == null ) return false;
        if( s.contains(k - root.val) ) return true;
        s.add(root.val);
        return find(root.left, k, s) || find(root.right, k, s);
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
