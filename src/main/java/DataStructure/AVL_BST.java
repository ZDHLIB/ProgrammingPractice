package DataStructure;

import java.util.Arrays;
import java.util.LinkedList;

public class AVL_BST {

    private TreeNode root;

    public static class TreeNode{
        int val;
        int height;
        AVL_BST.TreeNode left;
        AVL_BST.TreeNode right;
        TreeNode(int x) { val = x; height = 1; }
    }

    public AVL_BST(Integer[] array){
        Arrays.stream(array).forEach(x -> root = this.insertNode(root, x));
    }

    public TreeNode insertNode(TreeNode node, Integer value){
        if(node == null){
            return new TreeNode(value);
        }
        if(value < node.val){
            node.left = insertNode(node.left, value);
        } else if (value > node.val) {
            node.right = insertNode(node.right, value);
        } else {
            return node;
        }

        node.height = 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));

        int balance = calculateBalance(node);

        // right rotate
        //         z                                      y
        //        / \                                   /   \
        //       y   T4      Right Rotate (z)          x      z
        //      / \          - - - - - - - - ->      /  \    /  \
        //     x   T3                               T1  T2  T3  T4
        //    / \
        //  T1   T2
        if(balance > 1 && value < node.left.val){
            return rightRotate(node);
        }

        // left rotate
        //    z                               y
        //  /  \                            /   \
        // T1   y     Left Rotate(z)       z      x
        //     /  \   - - - - - - - ->    / \    / \
        //    T2   x                     T1  T2 T3  T4
        //        / \
        //      T3  T4
        if(balance < -1 && value > node.right.val){
            return leftRotate(node);
        }

        // left right rotate
        //     z                               z                           x
        //    / \                            /   \                        /  \
        //   y   T4  Left Rotate (y)        x    T4  Right Rotate(z)    y      z
        //  / \      - - - - - - - - ->    /  \      - - - - - - - ->  / \    / \
        //T1   x                          y    T3                    T1  T2 T3  T4
        //    / \                        / \
        //  T2   T3                    T1   T2
        if(balance > 1 && value > node.left.val){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // right left rotate
        //   z                            z                            x
        //  / \                          / \                          /  \
        //T1   y   Right Rotate (y)    T1   x      Left Rotate(z)   z      y
        //    / \  - - - - - - - - ->     /  \   - - - - - - - ->  / \    / \
        //   x   T4                      T2   y                  T1  T2  T3  T4
        //  / \                              /  \
        //T2   T3                           T3   T4
        if(balance < -1 && value < node.right.val){
            node.left = rightRotate(node.left);
            return leftRotate(node);
        }

        return node;
    }

    private TreeNode rightRotate(TreeNode node){
        TreeNode leftNode = node.left;
        node.left = leftNode.right;
        leftNode.right = node;

        node.height = 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
        leftNode.height = 1 + Math.max(calculateHeight(leftNode.left), calculateHeight(leftNode.right));

        return leftNode;
    }

    private TreeNode leftRotate(TreeNode node){
        TreeNode rightNode = node.right;
        node.right = rightNode.left;
        rightNode.left = node;

        node.height = 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
        rightNode.height = 1 + Math.max(calculateHeight(rightNode.left), calculateHeight(rightNode.right));

        return rightNode;
    }

    private int calculateBalance(TreeNode node) {
        return node == null ? 0 : calculateHeight(node.left) - calculateHeight(node.right);
    }

    private int calculateHeight(TreeNode node){
        return node == null ? 0 : node.height;
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



        node.height = 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));

        int balance = calculateBalance(node);

        // right rotate
        //         z                                      y
        //        / \                                   /   \
        //       y   T4      Right Rotate (z)          x      z
        //      / \          - - - - - - - - ->      /  \    /  \
        //     x   T3                               T1  T2  T3  T4
        //    / \
        //  T1   T2
        if(balance > 1 && calculateBalance(node.left) >= 0){
            return rightRotate(node);
        }

        // left rotate
        //    z                               y
        //  /  \                            /   \
        // T1   y     Left Rotate(z)       z      x
        //     /  \   - - - - - - - ->    / \    / \
        //    T2   x                     T1  T2 T3  T4
        //        / \
        //      T3  T4
        if(balance < -1 && calculateBalance(node.right) <= 0){
            return leftRotate(node);
        }

        // left right rotate
        //     z                               z                           x
        //    / \                            /   \                        /  \
        //   y   T4  Left Rotate (y)        x    T4  Right Rotate(z)    y      z
        //  / \      - - - - - - - - ->    /  \      - - - - - - - ->  / \    / \
        //T1   x                          y    T3                    T1  T2 T3  T4
        //    / \                        / \
        //  T2   T3                    T1   T2
        if(balance > 1 && calculateBalance(node.left) < 0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // right left rotate
        //   z                            z                            x
        //  / \                          / \                          /  \
        //T1   y   Right Rotate (y)    T1   x      Left Rotate(z)   z      y
        //    / \  - - - - - - - - ->     /  \   - - - - - - - ->  / \    / \
        //   x   T4                      T2   y                  T1  T2  T3  T4
        //  / \                              /  \
        //T2   T3                           T3   T4
        if(balance < -1 && calculateBalance(node.right) > 0){
            node.right = rightRotate(node.right);
            return leftRotate(node);
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
        AVL_BST bst = new AVL_BST(array);
        bst.printBST();
        bst.deleteNode(bst.root, 6);
        bst.printBST();
    }
}
