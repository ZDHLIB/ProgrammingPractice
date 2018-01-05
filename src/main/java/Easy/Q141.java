package Easy;

public class Q141 {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head, p2 = head;
        while(p1 != null && p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                return true;
            }
        }
        return false;
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
