// Last updated: 2/16/2026, 3:38:06 PM
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
17    HashMap<Integer, Integer> hm = new HashMap<>();
18    HashMap<Integer, Integer>ans = new HashMap<>();
19    public int[] treeQueries(TreeNode root, int[] queries) {
20        height(root);
21        sol(root, 0, 0);
22        int[] res = new int[queries.length];
23        for(int i = 0; i < queries.length; i++) {
24            res[i] =ans.get(queries[i]);
25        }
26        return res;
27    }
28
29    private int height(TreeNode node) {
30        if(node==null) return -1;
31
32        int left = height(node.left);
33        int right = height(node.right);
34
35        int h = Math.max(left, right) + 1;
36        hm.put(node.val, h);
37        return h;
38    }
39
40    private void sol(TreeNode node, int depth, int max) {
41        if(node == null) return;
42       ans.put(node.val, max);
43        int l = -1;
44        if(node.left != null){
45           l=hm.get(node.left.val);
46        }
47        int r = -1;
48        if(node.right!=null){
49            r= hm.get(node.right.val);
50        }
51
52        sol(node.left,depth + 1,Math.max(max, depth + 1 + r));
53        sol(node.right,depth + 1,Math.max(max, depth + 1 + l));
54    }
55}