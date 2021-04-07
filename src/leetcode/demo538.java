package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo538 {
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
    List<TreeNode> lists=new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        zhong(root);
        for(int i=0;i<lists.size();i++){
            TreeNode p=lists.get(i);
            for(int j=i+1;j<lists.size();j++){
                TreeNode q=lists.get(j);
                p.val+=q.val;
            }
        }
        return root;
    }
    public void zhong(TreeNode root){
        if(root!=null){
            zhong(root.left);
            lists.add(root);
            zhong(root.right);
        }
    }
}
