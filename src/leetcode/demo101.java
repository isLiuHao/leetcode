package leetcode;

public class demo101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else return ismirror(root.left,root.right);
    }
    public boolean ismirror(TreeNode p,TreeNode q){
        if(p==null&&q==null)//都为NULL
            return true;
        else if(p==null||q==null)//有一个为NULL
            return false;
        else if(p.val==q.val)
            return ismirror(p.left,q.right)&&ismirror(p.right,q.left);
        else return false;
    }
}
