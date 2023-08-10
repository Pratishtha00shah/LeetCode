/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int parentval = root.val;
        int pVal= p.val;
        int qVal = q.val;
        
        if(pVal > parentval && qVal > parentval){
           return lowestCommonAncestor(root.right, p, q);
        }
        if(pVal<parentval && qVal<parentval){
            return lowestCommonAncestor(root.left, p, q);
        }
       
        else{
            return root;
        }
    }
}