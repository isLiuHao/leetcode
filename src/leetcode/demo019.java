package leetcode;

public class demo019 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode s=new ListNode();
        ListNode tail=new ListNode();
        s=head;tail=s;
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        if(len==n)return s.next;
        for(int i=0;i<len;i++){
            if(i==len-n-1) {
                tail.next=tail.next.next;i++;
            }
            tail=tail.next;
        }
        return s;
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode first=new ListNode();
        ListNode second=new ListNode();
        first.next=head;second=head;int i=1;
        while(i<n){
            second=second.next;
            i++;
        }
        if(second.next==null)return head.next;
        while(second.next!=null){
            first=first.next;
            second=second.next;
        }
        first.next=first.next.next;
        return head;
    }
}
