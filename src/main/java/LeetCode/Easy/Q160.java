package LeetCode.Easy;

public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int gap = 0;
        ListNode A = headA;
        ListNode B = headB;
        while(headA != null) {
            gap++;
            headA = headA.next;
        }
        while(headB != null) {
            gap--;
            headB = headB.next;
        }
        if( gap > 0 ){
            while(gap > 0){
                A = A.next;
                gap--;
            }
        }else if(gap < 0){
            while(gap!=0){
                B = B.next;
                gap++;
            }
        }
        while(A != null && A != B){
            A = A.next;
            B = B.next;
        }
        return A;
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
