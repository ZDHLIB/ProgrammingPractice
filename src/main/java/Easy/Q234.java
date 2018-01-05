package Easy;

public class Q234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head, reverse = null;
        while(fast != null && fast.next != null){
            ListNode tmp = reverse;
            fast = fast.next.next;
            reverse = slow;
            slow = slow.next;
            reverse.next = tmp;
        }
        if(fast!=null){
            slow = slow.next;
        }
        while(slow != null){
            if(reverse.val != slow.val){
                return false;
            }else{
                reverse = reverse.next;
                slow = slow.next;
            }
        }
        return true;
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
