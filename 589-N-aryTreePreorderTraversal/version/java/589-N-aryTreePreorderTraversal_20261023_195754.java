// Last updated: 10/23/2026, 7:57:54 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20public class Solution {
21    public List<Integer> preorder(Node root) {
22        List<Integer> ans=new ArrayList<>();
23        dfs(root,ans);
24        return ans;
25    }
26    public void dfs(Node node,List<Integer> result) {
27    if(node==null) {
28        return;
29    }
30       result.add(node.val);
31       for (int i=0; i < node.children.size();i++) {
32           dfs(node.children.get(i),result);
33        }
34    }
35}
36