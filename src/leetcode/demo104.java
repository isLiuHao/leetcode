package leetcode;

public class demo104 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public int maxDepth(TreeNode root) {
        if(root!=null){
            int depth1=maxDepth(root.left);
            int depth2=maxDepth(root.right);
            return depth1>depth2?depth1:depth2+1;
        }
        else return 0;
    }
}
