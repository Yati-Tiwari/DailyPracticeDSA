// Last updated: 8/14/2025, 11:24:57 AM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> Paths=new ArrayList<>();
        if(root != null){
            rtlp(root,"",Paths);
        }
        return Paths;
    }
    public void rtlp (TreeNode node, String Path, List<String> Paths){
        if(node.left==null && node.right==null){
            Paths.add(Path + node.val);
        }
        if(node.left!=null){
            rtlp(node.left, Path+node.val+ "->" , Paths);
        }
        if(node.right!=null){
            rtlp(node.right, Path+node.val+ "->" , Paths);
        }
    }
}