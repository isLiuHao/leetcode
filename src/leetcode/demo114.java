package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo114 {
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
    List<TreeNode> list=new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root == null) return;
        inorder(root);
        TreeNode pre=list.get(0);
        for(int i=1;i<list.size();i++){
            TreeNode next=list.get(i);
            pre.left=null;
            pre.right=next;
            pre=pre.right;
        }
    }
    public void inorder(TreeNode root){
        if(root!=null){
            list.add(root);
            inorder(root.left);
            inorder(root.right);
        }
    }
}
