// Last updated: 12/11/2025, 8:13:10 PM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if (root==null) {
19            return null;
20        }
21        if (root.val < key) {
22            root.right=deleteNode(root.right, key);
23        } else if (root.val > key) {
24            root.left=deleteNode(root.left, key);
25        } else {
26            // Node to be deleted found
27            if (root.left==null) {
28                return root.right;
29            } else if (root.right==null) {
30                return root.left;
31            } else {
32                // Node has two children
33                int max=findMax(root.left);
34                root.val=max;
35                root.left=deleteNode(root.left, max);
36            }
37        }
38        return root;
39    }
40    public int findMax(TreeNode node) {
41        while (node.right != null) {
42            node=node.right;
43        }
44        return node.val;
45    }
46}
47