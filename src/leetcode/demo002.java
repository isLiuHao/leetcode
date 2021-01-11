package leetcode;

import org.junit.Test;

public class demo002 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode p=new ListNode(0);
        String a="",b="";
        while(l1!=null){
            a=a+l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            b=b+l2.val;
            l2=l2.next;
        }
        int len1=a.length(),len2=b.length();
        int JW=0,i=0,j=0;
        l3.val=(JW+(a.charAt(i)-'0')+(b.charAt(j)-'0'))%10;
        JW=(JW+(a.charAt(i)-'0')+(b.charAt(j)-'0'))/10;
        i++;j++;
        p=l3;
        while(i<len1&&j<len2){
            ListNode q=new ListNode(0);
            q.val=(JW+(a.charAt(i)-'0')+(b.charAt(j)-'0'))%10;
            JW=(JW+(a.charAt(i)-'0')+(b.charAt(j)-'0'))/10;
            p.next=q;
            p=q;
            i++;j++;
        }
        while(i<len1){
            ListNode q=new ListNode(0);
            q.val=(a.charAt(i)-'0'+JW)%10;
            JW=(a.charAt(i)-'0'+JW)/10;
            p.next=q;
            p=q;
            i++;
        }
        while(j<len2){
            ListNode q=new ListNode(0);
            q.val=(b.charAt(j)-'0'+JW)%10;
            JW=(b.charAt(j)-'0'+JW)/10;
            p.next=q;
            p=q;
            i++;
        }
        if(JW!=0){
            ListNode q=new ListNode(0);
            q.val=JW;
            p.next=q;
            p=q;
        }
        return l3;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head=null;
        ListNode tail=new ListNode(0);
        int carry=0;
        while(l1!=null||l2!=null){
            int n1=l1!=null?l1.val:0;
            int n2=l2!=null?l2.val:0;
            int sum=n1+n2+carry;
            if(head==null){
                head=new ListNode(sum%10);
                tail=head;
            }
            else{
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            carry=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry!=0) tail.next=new ListNode(carry);
        return head;
    }

    @Test
    public void test(){
        String a="12";
        int i=a.charAt(0)-'0';

        System.out.println(i);
    }

}
