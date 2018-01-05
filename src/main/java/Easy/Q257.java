package Easy;

import java.util.ArrayList;
import java.util.List;

public class Q257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        dfs(res, root, "");
        return res;
    }

    public void dfs(List<String> res, TreeNode root, String path) {
        if(root == null){
            return;
        } else if( root.left == null && root.right == null ){
            res.add(path + root.val);
        }
        if( root.left != null ){
            dfs(res, root.left, path + root.val + "->");
        }
        if( root.right != null ){
            dfs(res, root.right, path + root.val + "->");
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
