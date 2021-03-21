package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo098 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    List<Integer> lists=new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        pre(root);
        int min=lists.get(0);
        for(int i=1;i<lists.size();i++){
            if(lists.get(i)>min)min=lists.get(i);
            else return false;
        }
        return true;
    }
    public void pre(TreeNode root) {
        if(root!=null){
            pre(root.left);
            lists.add(root.val);
            pre(root.right);
        }
    }
}
