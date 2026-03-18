// Last updated: 3/18/2026, 2:25:33 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17		    public void flatten(TreeNode root) {
18		    	MakeLL(root);
19		    }
20		    public TreeNode MakeLL(TreeNode root) {
21		    	if(root==null) {
22		    		return null;
23		    	}
24		    	if(root.left==null && root.right==null) {
25		    		return root;
26		    	}
27		    	TreeNode left_tail=MakeLL(root.left);
28		    	TreeNode right_tail=MakeLL(root.right);
29		    	if(root.left!=null) {
30		    		left_tail.right=root.right;
31		    		root.right=root.left;
32		    		root.left=null;
33		    		
34		    	}
35		    	return right_tail != null ? right_tail : left_tail;
36		    }
37		}