package LeetCode.Easy;

public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        if( p1 == null && p2 != null )  return p2;
        else if(p2 == null && p1 != null )  return p1;
        else if(p1.val < p2.val){
            p1.next = mergeTwoLists(p1.next, p2);
            return p1;
        }else{
            p2.next = mergeTwoLists(p1, p2.next);
            return p2;
        }
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                tmp.next = p1;
                p1 = p1.next;
            }else{
                tmp.next = p2;
                p2 = p2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = (p1==null)?p2:p1;
        return head.next;
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
