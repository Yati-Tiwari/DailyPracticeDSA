// Last updated: 8/29/2025, 8:17:08 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> lT1=new ArrayList<>();
        Traverse(root1,lT1);
         List<Integer> lT2=new ArrayList<>();
        Traverse(root2,lT2);
        for(int i=0;i<lT2.size();i++){
            lT1.add(lT2.get(i));
        }
        Collections.sort(lT1);
        return lT1;

    }
    public static void Traverse(TreeNode root,List<Integer> l){
        if(root==null){
            return;
        }
        l.add(root.val);
        Traverse(root.left,l);
        Traverse(root.right,l);

    }
}