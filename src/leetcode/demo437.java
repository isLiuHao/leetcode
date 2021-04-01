package leetcode;

public class demo437 {
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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return Sum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public int Sum(TreeNode root,int sum) {
        if(root==null)return 0;
        sum-=root.val;
        if(sum==0)
            return  Sum(root.left,sum)+Sum(root.right,sum)+1;
        return Sum(root.left,sum)+Sum(root.right,sum);
    }

    int pathnumber=0;
    public int pathSum1(TreeNode root, int sum) {
        if(root!=null){
            Sum(root,sum);
            pathSum(root.left,sum);
            pathSum(root.right,sum);
            return pathnumber;
        }
        return 0;
    }
    public void Sum1(TreeNode root,int sum) {
        if(root!=null){
            sum-=root.val;
            if(sum==0)pathnumber++;
            Sum(root.left,sum);
            Sum(root.right,sum);
        }
    }
}
