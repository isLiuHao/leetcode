package leetcode;

public class demo021 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode c=l3;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                c.next=l1;
                l1=l1.next;
            }
            else{
                c.next=l2;
                l2=l2.next;
            }
            c=c.next;
        }
        c.next = l1 == null ? l2 : l1;
        return l3.next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
