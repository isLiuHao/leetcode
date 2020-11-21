package leetcode;

public class demo404 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        return sumOfLeftLeaves(root.right)+sumOfLeftLeaves(root.left)+
                (root.left!=null&&root.left.left==null&&root.left.right==null?root.left.val:0);
    }

}
