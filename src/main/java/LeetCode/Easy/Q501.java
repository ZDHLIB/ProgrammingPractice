package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class Q501 {
    TreeNode prev = null;
    int count = 0, max = -1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        prev = root;
        inOrder(root, list);
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void inOrder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inOrder(root.left, list);
        if(prev.val == root.val){
            count++;
        }else{
            count = 1;
        }
        if(count == max){
            list.add(root.val);
        }else if( count > max ){
            list.clear();
            list.add(root.val);
            max = count;
        }
        prev = root;
        inOrder(root.right,list);
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
