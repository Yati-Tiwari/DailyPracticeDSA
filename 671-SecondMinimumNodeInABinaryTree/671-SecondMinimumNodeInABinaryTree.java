// Last updated: 8/14/2025, 11:22:36 AM
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
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null || root.left==null || root.right==null) {
            return -1;
        }
        int left=root.left.val;
        int right=root.right.val;
        if (root.val == left) {
            left=findSecondMinimumValue(root.left);
        }
        if (root.val==right) {
            right = findSecondMinimumValue(root.right);
        }
        if (left== -1) {
            return right;
        }
        if (right== -1) {
            return left;
        }
        return Math.min(left, right);
    }
}
