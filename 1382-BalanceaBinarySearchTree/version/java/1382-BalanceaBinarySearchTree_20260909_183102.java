// Last updated: 9/9/2026, 6:31:02 PM
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
17    public TreeNode balanceBST(TreeNode root) {
18        List<TreeNode> list=new ArrayList<>();
19        inorder(root,list);
20        return build(list, 0,list.size()-1);
21    }
22
23    // inorder traversal to store nodes in sorted order
24    private void inorder(TreeNode root,List<TreeNode> list) {
25        if(root==null){
26            return;
27        }
28        inorder(root.left,list);
29        list.add(root);
30        inorder(root.right,list);
31    }
32    // balanced BST from sorted nodes
33    private TreeNode build(List<TreeNode> list, int l,int r) {
34        if(l>r){
35            return null;
36        }
37        int mid=(l+r) / 2;
38        TreeNode root=list.get(mid);
39        root.left=build(list, l, mid-1);
40        root.right=build(list, mid+1, r);
41        return root;
42    }
43}
44