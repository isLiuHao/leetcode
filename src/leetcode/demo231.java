package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo231 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public boolean isPalindrome(ListNode head) {
        List<Integer> list =new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int first=0;
        int last=list.size()-1;
        while(first<last){
            if(!list.get(first).equals(list.get(last)))return false;
            first++;
            last--;
        }
        return true;
    }
}
