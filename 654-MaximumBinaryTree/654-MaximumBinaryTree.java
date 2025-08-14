// Last updated: 8/14/2025, 11:22:44 AM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build_Tree(nums, 0, nums.length);
    }
    public TreeNode build_Tree(int[] nums, int left, int right) {
        if (left >= right){
             return null;
        }
        int Max_Index = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[Max_Index]) {
                Max_Index = i;
            }
        }
        TreeNode root = new TreeNode(nums[Max_Index]);
        root.left = build_Tree(nums, left, Max_Index);
        root.right = build_Tree(nums, Max_Index + 1, right);
        return root;
    }
}
