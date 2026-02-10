// Last updated: 2/10/2026, 2:16:23 PM
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
17    long totalSum=0;
18    long maxProd=0;
19    static int MOD=1_000_000_007;
20    private void dfsTotal(TreeNode root) {
21        if(root==null) return;
22        totalSum += root.val;
23        dfsTotal(root.left);
24        dfsTotal(root.right);
25    }
26    private long dfs(TreeNode root) {
27        if (root==null){
28            return 0;
29        }
30        long left=dfs(root.left);
31        long right=dfs(root.right);
32        long subSum=left + right + root.val;
33        maxProd=Math.max(maxProd,subSum * (totalSum-subSum));
34        return subSum;
35    }
36    public int maxProduct(TreeNode root) {
37        dfsTotal(root);
38        dfs(root);
39        return (int)(maxProd % MOD);
40    }
41}