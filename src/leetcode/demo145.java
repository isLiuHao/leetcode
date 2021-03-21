package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo145 {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        Stack<TreeNode> t=new Stack<>();
        while(root!=null||!s.isEmpty()){
            if(root!=null){
                t.add(root);
                s.add(root);
                root=root.right;
            }
            else{
                root=s.pop();
                root=root.left;
            }
        }
        while(!t.isEmpty()){
            root=t.pop();
            lists.add(root.val);
        }
        return lists;
    }
}
