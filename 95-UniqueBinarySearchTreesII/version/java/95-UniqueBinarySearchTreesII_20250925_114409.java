// Last updated: 9/25/2025, 11:44:09 AM
class Solution {
    TreeNode first, second, prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        // swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorder(root.right);
    }
}
