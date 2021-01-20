package leetcode;

public class demo023 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        if(lists.length==1)return lists[0];
        return merge(0,lists.length-1,lists);
    }
    public ListNode merge(int l,int r,ListNode[] lists){
        if(l==r)return lists[l];
        int mid=(l+r)/2;
        ListNode l1=merge(l,mid,lists);
        ListNode l2=merge(mid+1,r,lists);
        return mergeTwoLists(l1,l2);
    }
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if(a==null||b==null)
            return a!=null?a:b;
        ListNode head=new ListNode(0);
        ListNode tail=head;
        while(a!=null&&b!=null){
            if(a.val<=b.val){
                tail.next=a;
                tail=tail.next;
                a=a.next;
            }
            else {
                tail.next=b;
                tail=tail.next;
                b=b.next;
            }
        }
        tail.next=a!=null?a:b;
        return head.next;
    }
}
