// Last updated: 8/14/2025, 11:21:15 AM
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
		int Camera=0;
	    public int minCameraCover(TreeNode root) {
	    	int c=minCamera(root);
	    	if(c==-1) {
	    		Camera++;
	    	}
	        return Camera;
	    }
	    public int minCamera(TreeNode root) {
	    	if(root==null) {
	    		return 0;
	    	}
	    	int left=minCamera(root.left);
	    	int right=minCamera(root.right);
	    	if(left==-1 || right==-1) { // is node Camera ki need hai
	    		Camera++;
	    		return 1; // Camera setup kiya hai is node pe
	    	}
	    	if(left==1 || right==1) // in mei se koi ek k pass ya dono k  camera  hai or ek k pass camera hai ya doosra vala cover hai 
	    	{
	    		return 0; // iska mtlb covered hu
	    	}
	    	else {
	    		return -1; // need a camera
	    	}
	    }
	}

