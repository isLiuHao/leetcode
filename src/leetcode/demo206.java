package leetcode;

public class demo206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode headB=null;
        while(head!=null){
            ListNode r=head.next;
            head.next=headB;
            headB=head;
            head=r;
        }
        return headB;
    }

}
