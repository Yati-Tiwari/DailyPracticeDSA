// Last updated: 2/8/2026, 3:07:33 PM
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
17    public boolean isBalanced(TreeNode root) {
18        return checkHeight(root) != -1;
19    }
20
21    private int checkHeight(TreeNode node) {
22        if(node==null){
23            return 0;
24        }
25        int leftHeight=checkHeight(node.left);
26        if(leftHeight==-1){
27            return -1; 
28        }// Left subtree not balanced
29
30        int rightHeight=checkHeight(node.right);
31        if(rightHeight==-1){
32            return -1; // Right subtree not balanced
33        }
34        if(Math.abs(leftHeight-rightHeight) > 1){
35            return -1; // Current node not balanced
36        }
37        return Math.max(leftHeight,rightHeight)+1; //height
38    }
39}
40