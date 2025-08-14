// Last updated: 8/14/2025, 11:13:50 AM
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
        public int widthOfBinaryTree(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            int width=0;
            q.add(new Pair(root, 0));
            while (!q.isEmpty()) {
                Pair start=q.peek();
                int s=q.size();
                Pair end=null;
                for (int i = 0; i < s; i++) {
                    end = q.poll();
                    if (end.Node.left != null) {
                        q.add(new Pair(end.Node.left, 2 * end.idx + 1));
                    }
                    if (end.Node.right != null) {
                        q.add(new Pair(end.Node.right, 2 * end.idx + 2));
                    }
                }
                width = Math.max(width, end.idx - start.idx + 1);
            }
            return width;
        }
    }
    class Pair {
        TreeNode Node;
        int idx;
    public Pair(TreeNode Node, int idx) {
        this.Node = Node;
        this.idx = idx;
    }
}