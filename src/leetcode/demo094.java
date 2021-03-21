package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo094 {
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
    List<Integer> lists=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode L=new TreeNode(0);
        L=root;
        while(L!=null||!s.isEmpty()){
            if(L!=null){
                s.add(L);
                L=L.left;
            }
            else{
                L=s.pop();
                lists.add(L.val);
                L=L.right;
            }
        }
        return lists;
    }
}
