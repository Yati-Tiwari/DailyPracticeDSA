// Last updated: 8/14/2025, 11:25:47 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Preorder(root,ans);
        return ans;

    }
    public void Preorder(TreeNode node,List<Integer> ans){
        if(node==null){
            return;
        }
        ans.add(node.val);
        Preorder(node.left,ans);
        Preorder(node.right,ans);

    }
}