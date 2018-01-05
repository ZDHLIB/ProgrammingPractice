package Easy;

public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode P = head;
        while(head != null){
            if(head.val == val){
                ListNode tmp = head;
                P = head.next;
                head = head.next;
                tmp = null;
            }else{
                break;
            }
        }
        while(head != null && head.next != null){
            if( head.next.val == val ){
                ListNode tmp = head.next;
                head.next = head.next.next;
                tmp = null;
            }else{
                head = head.next;
            }
        }
        return P;
    }

    public ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode P = dummy;
        dummy.next = head;
        while(dummy.next!=null){
            if(dummy.next.val == val){
                ListNode tmp = dummy.next;
                dummy.next = dummy.next.next;
                tmp = null;
            }else{
                dummy = dummy.next;
            }
        }
        return P.next;
    }

    public ListNode removeElements3(ListNode head, int val) {
        if(head == null) return null;
        head.next = removeElements(head.next,val);
        return (head.val == val) ? head.next : head;
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
