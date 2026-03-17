// Last updated: 3/17/2026, 12:01:50 PM
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
17    private int ans=0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        dia(root);
20        return ans;
21    }
22    public int dia(TreeNode root){
23        if(root==null){
24            return 0;
25        }
26        int left=dia(root.left);
27        int right=dia(root.right);
28        ans=Math.max(ans,(left+right));
29        return Math.max(left,right)+1;
30    }
31
32}