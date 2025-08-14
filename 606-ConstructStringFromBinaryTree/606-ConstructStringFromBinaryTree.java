// Last updated: 8/14/2025, 11:22:57 AM
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
    public String tree2str(TreeNode root) {
        if (root==null){
             return "";
        }
        String Result = Integer.toString(root.val);
        if (root.left != null || root.right != null) {
            Result += "(" + tree2str(root.left) + ")";
        }
        if (root.right != null) {
            Result += "(" + tree2str(root.right) + ")";
        }
        return Result;
    }
}
