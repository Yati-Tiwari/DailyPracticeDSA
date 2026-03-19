// Last updated: 3/19/2026, 10:50:33 AM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        if(nums.length==0 || nums==null){
19            return null;
20        }
21        return construct(nums,0,nums.length-1);
22    }
23    public TreeNode construct(int[] nums,int left,int right){
24        if(left>right){
25            return null;
26        }
27        int mid=left+(right-left)/2;
28        TreeNode node=new TreeNode(nums[mid]);
29        node.left=construct(nums,left,mid-1);
30        node.right=construct(nums,mid+1,right);
31        return node;
32    }
33}