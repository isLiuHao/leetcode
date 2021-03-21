package leetcode;

public class demo105 {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    //左闭右开
    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        if(p_start==p_end)return null;
        int r_val=preorder[p_start];
        TreeNode root=new TreeNode(r_val);
        int index=-1;
        for(int i=i_start;i<i_end;i++){
            if(inorder[i]==r_val){
                index=i;
            }
        }
        int len=index-i_start;
        root.left =buildTreeHelper(preorder,p_start+1,     p_start+1+len,inorder,i_start,index);
        root.right=buildTreeHelper(preorder,p_start+1+len, p_end,        inorder,index+1,i_end);
        return root;
    }

}
