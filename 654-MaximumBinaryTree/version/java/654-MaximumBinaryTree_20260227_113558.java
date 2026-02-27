// Last updated: 2/27/2026, 11:35:58 AM
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
17    public TreeNode constructMaximumBinaryTree(int[] nums) {
18        return build_Tree(nums, 0, nums.length);
19    }
20    public TreeNode build_Tree(int[] nums, int left, int right) {
21        if (left >= right){
22             return null;
23        }
24        int Max_Index = left;
25        for (int i = left + 1; i < right; i++) {
26            if (nums[i] > nums[Max_Index]) {
27                Max_Index = i;
28            }
29        }
30        TreeNode root = new TreeNode(nums[Max_Index]);
31        root.left = build_Tree(nums, left, Max_Index);
32        root.right = build_Tree(nums, Max_Index + 1, right);
33        return root;
34    }
35}
36