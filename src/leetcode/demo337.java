package leetcode;

import java.util.HashMap;

public class demo337 {
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
    HashMap<TreeNode, Integer> memory = new HashMap<>();
    //爷爷的钱+4个孙子的钱  vs  2个儿子的钱
    public int rob(TreeNode root) {
        if (root == null) return 0;
        if(memory.containsKey(root))return memory.get(root);
        int money = root.val;
        if (root.left != null) {
            money += (rob(root.left.left) + rob(root.left.right));
        }
        if (root.right != null) {
            money += (rob(root.right.left) + rob(root.right.right));
        }
        int res=Math.max(money, rob(root.left) + rob(root.right));
        memory.put(root,res);
        return res;
    }
}
