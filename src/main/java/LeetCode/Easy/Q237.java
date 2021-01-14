package LeetCode.Easy;

public class Q237 {
    public void deleteNode(ListNode node) {
        if(node.next != null){
            node.val = node.next.val;
            ListNode tmp = node.next;
            node.next = node.next.next;
            tmp = null;
        }else{
            node = null;
        }
    }

    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x){
            this.val = x;
            this.next = null;
        }
    }
}
