// Last updated: 8/14/2025, 11:25:21 AM
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
    private int max_depth = 0; // Declare max_depth as a class variable

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rightView(root, 1, ll);
        return ll;
    }

    public void rightView(TreeNode root, int curr, List<Integer> ll) {
        if (root == null) {
            return;
        }
        if (max_depth < curr) {
            ll.add(root.val);
            max_depth = curr;
        }
        rightView(root.right, curr + 1, ll);
        rightView(root.left, curr + 1, ll);
    }
}
