// Last updated: 8/14/2025, 11:22:10 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> rslt = new ArrayList<>();
        dfs(root, rslt);
        return rslt;
    }
    public void dfs(Node node, List<Integer> result) {
    if (node==null) {
        return;
    }
       result.add(node.val);
       for (int i = 0; i < node.children.size(); i++) {
           dfs(node.children.get(i), result);
        }
    }
}
