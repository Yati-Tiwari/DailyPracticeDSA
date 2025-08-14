// Last updated: 8/14/2025, 11:23:10 AM
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
public class Solution {
     int total_Tilt = 0;
    public int findTilt(TreeNode root) {
        postOrder(root);
        return total_Tilt;
    }
    public int postOrder(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left=postOrder(node.left);
        int right=postOrder(node.right);
        total_Tilt += Math.abs(left - right);
        int result=left + right + node.val;
        return result;
    }
}
