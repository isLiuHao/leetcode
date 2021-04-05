package leetcode;

public class demo543 {
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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        deep(root);
        return max;
    }
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = deep(root.left);
        int right= deep(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
