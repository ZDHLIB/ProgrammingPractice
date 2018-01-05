package Easy;

public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode P = head;
        while(head.next != null){
            if(head.val == head.next.val){
                ListNode tmp = head.next;
                head.next = head.next.next;
                tmp = null;
            }else{
                head = head.next;
            }
        }
        return P;
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
