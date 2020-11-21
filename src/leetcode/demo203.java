package leetcode;

public class demo203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode a=new ListNode(0);
        a.next=head;
        ListNode pre=a,pnext=head;
        while(pnext!=null){
            if(pnext.val==val){
                pre.next=pnext.next;
            }else{
                pre=pre.next;
            }
            pnext=pnext.next;
        }
        return pre.next;
    }
}
