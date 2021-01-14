package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q101 {
    //bfs
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode leftNode = q.poll();
            TreeNode rightNode = q.poll();
            if( leftNode == null && rightNode == null ){
                continue;
            }
            if( leftNode == null || rightNode == null ){
                return false;
            }
            if( leftNode.val != rightNode.val ){
                return false;
            }
            q.offer(leftNode.left);
            q.offer(rightNode.right);
            q.offer(leftNode.right);
            q.offer(rightNode.left);
        }
        return true;
    }

    //dfs
    public boolean isSymmetric2(TreeNode root) {
        if(root == null) return true;
        return dfs(root, root);
    }

    public boolean dfs(TreeNode leftNode, TreeNode rightNode){
        if( leftNode == null && rightNode == null )  return true;
        if( leftNode == null || rightNode == null )  return false;
        if( leftNode.val != rightNode.val )  return false;
        return dfs(leftNode.left, rightNode.right) && dfs(leftNode.right, rightNode.left);
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
