// Last updated: 8/14/2025, 11:20:52 AM
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
    int Sum=0;
    public TreeNode bstToGst(TreeNode root) {
        traverse_GT(root);
        return root;
    }
    public void traverse_GT(TreeNode node) {
        if (node==null) 
        {
            return;
        }
        traverse_GT(node.right);
        Sum += node.val;
        node.val=Sum;
        traverse_GT(node.left);
    }
}
