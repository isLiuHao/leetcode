package leetcode;

public class demo025 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair=new ListNode(0);//头结点
        hair.next=head;
        ListNode pre=hair;          //转换的 前一个节点
        while(head!=null){
            ListNode tail=pre;      //转换的尾结点
            for(int i=0;i<k;i++){
                tail=tail.next;
                if(tail==null)
                    return hair.next;
            }
            ListNode next=tail.next;//转换的 后一个节点
            ListNode[] listNodes=reverse(head,tail);
            head=listNodes[0];tail=listNodes[1];
            pre.next=head;
            tail.next=next;
            pre=tail;
            head=next;
        }
        return hair.next;
    }
    public ListNode[] reverse(ListNode head,ListNode tail){//全部翻转
        ListNode pre=new ListNode(0);tail.next=null;
        ListNode p=head;pre.next=null;
        while(p!=null){
            ListNode next=p.next;
            p.next=pre.next;
            pre.next=p;
            p=next;
        }
        return new ListNode[]{tail, head};
    }
}
