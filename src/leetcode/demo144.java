package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<Integer> lists=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        while(root!=null||!s.isEmpty()){
            if(root!=null){
                lists.add(root.val);
                s.add(root);
                root=root.left;
            }
            else{
                root=s.pop();
                root=root.right;
            }
        }
        return lists;
    }
}
