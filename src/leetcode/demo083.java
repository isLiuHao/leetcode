package leetcode;

public class demo083 {
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        if(head==null)return null;
        while(p.next!=null){
            if(p.next.val!=p.val)p=p.next;
            else{
                p.next=p.next.next;
            }
        }
        return head;
    }
}
