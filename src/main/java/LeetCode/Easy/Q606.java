package LeetCode.Easy;

public class Q606 {
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        String res = String.valueOf(t.val);

        if(t.right != null){
            res += "(" + tree2str(t.left) + ")";
            res += "(" + tree2str(t.right) + ")";
        }else if(t.left != null){
            res += "(" + tree2str(t.left) + ")";
        }
        return res;
    }

    public class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
}
