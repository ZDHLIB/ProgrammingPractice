package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q111 {
    //bfs
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return 0;
        queue.offer(root);
        int res = 0;
        while(!queue.isEmpty()){
            res++;
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                if( node.left == null && node.right == null ){
                    return res;
                }
                if( node.left != null ){
                    queue.offer(node.left);
                }
                if( node.right != null ){
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }

    //dfs
    public int minDepth2(TreeNode root) {
        if(root == null) return 0;
        int res = Integer.MAX_VALUE;
        return Math.min(res, dfs(root));
    }

    public int dfs(TreeNode root){
        int res = Integer.MAX_VALUE;
        if(root.left == null && root.right == null){
            return 1;
        }
        if( root.left != null ){
            res = Math.min(res, dfs(root.left));
        }
        if( root.right != null ){
            res = Math.min(res, dfs(root.right));
        }
        return res;
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
