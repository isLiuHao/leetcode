package leetcode;

import java.util.HashSet;
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
}
