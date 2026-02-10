// Last updated: 2/10/2026, 3:28:32 PM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        if(root==null) return true;
19        if(root.val%2==0) return false;
20        return check(root);
21    }
22    public boolean check(TreeNode root) {
23			Queue<TreeNode> q=new LinkedList<>();
24			q.add(root); //addlast
25            int level=0;
26            int prev=0;
27			while(!q.isEmpty()) {
28                int size=q.size();
29                if(level%2==0){
30                    prev=-1;
31                }else{
32                    prev=Integer.MAX_VALUE;;
33                }
34                for (int i=0; i<size; i++) {
35				    TreeNode n=q.poll();
36                    if(level%2==0){
37                        if(n.val%2==0 || n.val<=prev) 
38                            return false;
39                    }else{
40                        if(n.val%2!=0 || n.val>=prev) 
41                            return false;
42                    }
43                    if(n.left!=null) q.add(n.left);
44                    if(n.right!=null) q.add(n.right);
45                    prev=n.val;
46                }
47                level++;
48			}
49            return true;
50		}
51}