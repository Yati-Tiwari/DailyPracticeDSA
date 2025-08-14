// Last updated: 8/14/2025, 11:23:18 AM
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
//  */
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//         int ld=diameterOfBinaryTree(root.left);
//         int rd=diameterOfBinaryTree(root.right);
//         int sd=ht(root.left)+ht(root.right)+2;
//         return Math.max(sd,Math.max(rd,ld));
//     } 
//     public int ht(TreeNode root) {
//         if(root==null) {
//         	return -1;
//         }
//         int lh=ht(root.left);
//         int rh=ht(root.right);
//         return Math.max(lh,rh)+1;
//     }
        
        
// }
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
    public int diameterOfBinaryTree(TreeNode root) {
		return diameter(root).dt;
		
	}
	public Diapair diameter(TreeNode root) {
		
		if(root==null) {
			return new Diapair();
		}
		Diapair ldp=diameter(root.left);
		
		Diapair rdp = diameter(root.right);
		int sd= ldp.ht +rdp.ht +2;
		Diapair sdp =new Diapair();
		sdp.dt = Math.max(sd,  Math.max(rdp.dt, ldp.dt));
		sdp.ht=Math.max(ldp.ht ,  rdp.ht) +1;
		return sdp;
	}
	class Diapair{
		int dt=0;
		int ht=-1;
	}
}