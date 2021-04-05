package leetcode;

public class demo617 {
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        TreeNode newT=new TreeNode(root1.val+root2.val);
        newT.left=mergeTrees(root1.left,root2.left);
        newT.right=mergeTrees(root1.right,root2.right);
        return newT;
    }
}
