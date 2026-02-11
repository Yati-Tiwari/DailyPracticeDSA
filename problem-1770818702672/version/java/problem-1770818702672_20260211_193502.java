// Last updated: 2/11/2026, 7:35:02 PM
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
17    ArrayList<Integer> curr;
18    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
19        List<List<Integer>> ans=new ArrayList<>();
20        curr=new ArrayList<>();
21        find(root);   // inorder -> sorted list
22        for (int x : queries) {
23            int small=floor(x);
24            int large=ceil(x);
25            List<Integer> temp=new ArrayList<>();
26            temp.add(small);
27            temp.add(large);
28            ans.add(temp);
29        }
30        return ans;
31    }
32    public void find(TreeNode root) {
33        if (root==null) return;
34        find(root.left);
35        curr.add(root.val);
36        find(root.right);
37    }
38
39    // largest value <= x
40    public int floor(int x) {
41        int l=0, r=curr.size()-1;
42        int ans=-1;
43        while (l<=r) {
44            int mid=(l+r) / 2;
45            if (curr.get(mid)<=x) {
46                ans=curr.get(mid);
47                l=mid+1;
48            } else {
49                r=mid-1;
50            }
51        }
52        return ans;
53    }
54    // smallest value >= x
55    public int ceil(int x) {
56        int l=0, r=curr.size()-1;
57        int ans=-1;
58        while (l<=r) {
59            int mid=(l+r) / 2;
60            if (curr.get(mid)>=x) {
61                ans=curr.get(mid);
62                r=mid-1;
63            } else {
64                l=mid+1;
65            }
66        }
67        return ans;
68    }
69}