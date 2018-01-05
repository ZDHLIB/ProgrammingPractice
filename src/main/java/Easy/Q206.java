package Easy;

public class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        if(head == null) return null;
        while(head != null){
            ListNode tmp = reverse;
            reverse = head;
            reverse.next = tmp;
            head = head.next;
        }
        return reverse;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
}
