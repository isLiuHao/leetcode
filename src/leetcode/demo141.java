package leetcode;

import java.util.HashSet;
import java.util.Set;

public class demo141 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(!set.add(head))
                return true;
            head=head.next;
        }
        return false;
    }
}
