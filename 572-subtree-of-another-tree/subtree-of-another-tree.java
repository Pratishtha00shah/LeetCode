/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        // Check if the current tree is equal to the target tree
        if (isSameTree(s, t)) {
            return true;
        }
        // Recursively check if the target tree is a subtree of the left or right subtree of the current tree
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are considered equal
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, the trees are not equal
        if (p == null || q == null) {
            return false;
        }
        // Check if the values of the current nodes are equal, and recursively check if the left and right subtrees are equal
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}