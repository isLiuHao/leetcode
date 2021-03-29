package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo236 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    Map<TreeNode,TreeNode> parents=new HashMap<>();
    Set<TreeNode> set = new HashSet<TreeNode>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        deep(root,null);
        while(p!=null){
            set.add(p);
            p=parents.get(p);
        }
        while(q!=null){
            if(set.contains(q)){
                return q;
            }
            q=parents.get(q);
        }
        return null;
    }
    public void deep(TreeNode root,TreeNode parent){
        if(root!=null){
            parents.put(root,parent);
            deep(root.left,root);
            deep(root.right,root);
        }
    }
}
