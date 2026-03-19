// Last updated: 3/19/2026, 11:17:33 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13       TreeNode current=root;
14       while(current!=null){
15        if(p.val<current.val && q.val<current.val){
16            current=current.left;
17        }
18        else if(p.val>current.val && q.val>current.val){
19            current=current.right;
20        }
21        else{
22            return current;
23        }
24       }
25       return null;
26    }
27    
28}