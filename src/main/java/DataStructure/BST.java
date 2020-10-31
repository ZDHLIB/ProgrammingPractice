package DataStructure;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class BST {

    private TreeNode root;

    public static class TreeNode{
        int val;
        BST.TreeNode left;
        BST.TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public BST(Integer[] array){
        Arrays.stream(array).forEach(x -> root = this.insertNode(root, x));
    }

    private TreeNode insertNode(TreeNode node, Integer value){
        if(node == null){
            return new TreeNode(value);
        }
        if(value < node.val){
            node.left = insertNode(node.left, value);
        } else {
            node.right = insertNode(node.right, value);
        }

        return node;
    }

    private TreeNode deleteNode(TreeNode node, Integer value){
        if(node == null) return null;
        if(value < node.val){
            node.left = deleteNode(node.left, value);
        } else if (value > node.val){
            node.right = deleteNode(node.right, value);
        } else {
            if( node.left == null && node.right == null) {
                return null;
            }
            if( node.left == null ){
                return node.right;
            }
            if( node.right == null ){
                return node.left;
            }
            TreeNode smallestNode = findSmallestNode(node.right);
            node.val = smallestNode.val;
            node.right = deleteNode(node.right, smallestNode.val);
        }
        return node;
    }

    private TreeNode findSmallestNode(TreeNode node){
        if(node.left == null) return node;
        return findSmallestNode(node.left);
    }

    private void printBST(){
        TreeNode node = root;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode head = queue.poll();
            if(head != null){
                System.out.print(head.val);
                System.out.print(", ");
                if(head.left != null)
                    queue.add(head.left);
                else
                    queue.add(null);
                if(head.right != null)
                    queue.add(head.right);
                else
                    queue.add(null);
            }
            else
                System.out.print("null, ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{2,4,6,7,2,9,0,3,1,8,4};
        BST bst = new BST(array);
        bst.printBST();
        bst.deleteNode(bst.root, 6);
        bst.printBST();
    }
}
