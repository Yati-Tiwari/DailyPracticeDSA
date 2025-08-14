// Last updated: 8/14/2025, 11:22:12 AM
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

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int maxChildDepth = 0;
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                Node child = root.children.get(i);
                maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
            }
        }
        int answer=maxChildDepth + 1;
        return answer;
    }
}
