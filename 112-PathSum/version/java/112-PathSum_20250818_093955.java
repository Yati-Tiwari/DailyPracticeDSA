// Last updated: 8/18/2025, 9:39:55 AM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> current_path=new ArrayList<>();
        PathSum_2(root,targetSum,current_path,res);
        return res;
 
    }
    public void PathSum_2(TreeNode node,int targetSum,List<Integer> current_path,List<List<Integer>> res){
        if(node == null){
            return;
        }
        current_path.add(node.val);
        if(node.left==null && node.right==null && targetSum==node.val){
            res.add(new ArrayList<>(current_path));
        }
        else{
            PathSum_2(node.left,targetSum-node.val,current_path,res);
            PathSum_2(node.right,targetSum-node.val,current_path,res);
        }
        current_path.remove(current_path.size()-1);
    }
    
    
}