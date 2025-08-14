// Last updated: 8/14/2025, 11:23:49 AM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) {
            return null;
        }
        if (root.val < key) {
            root.right=deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left=deleteNode(root.left, key);
        } else {
            // Node to be deleted found
            if (root.left==null) {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            } else {
                // Node has two children
                int max=findMax(root.left);
                root.val=max;
                root.left=deleteNode(root.left, max);
            }
        }
        return root;
    }
    public int findMax(TreeNode node) {
        while (node.right != null) {
            node=node.right;
        }
        return node.val;
    }
}
