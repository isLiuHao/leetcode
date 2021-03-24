package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class demo142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(!set.add(head)){//有重复
                return head;
            }
            head=head.next;
        }
        return null;
    }
    public ListNode detectCycle1(ListNode head) {
        List<ListNode> list=new ArrayList<>();
        while(head!=null){
            if(list.contains(head)){//有重复
                return head;
            }else list.add(head);
            head=head.next;
        }
        return null;
    }
}
