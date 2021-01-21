package leetcode;

public class demo024 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs1(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode prehead=new ListNode();
        ListNode s=prehead;
        ListNode pre=head;
        ListNode q=head.next;
        ListNode tail=q.next;
        while(true){
            pre.next=null;
            q.next=pre;
            s.next=q;
            s=pre;
            if(tail==null)break;
            else {
                pre=tail;
                if(tail.next==null){
                    s.next=tail;
                    break;
                }else {
                    q=tail.next;
                    tail=q.next;
                }
            }
        }
        return prehead.next;
    }

    public ListNode swapPairs(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode newHead=head.next;
        head.next=swapPairs(newHead.next);
        newHead.next=head;
        return newHead;
    }
}
