// Last updated: 12/10/2025, 8:32:55 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11        private int idx = 0;
12
13        // Encodes a tree to a single string.
14        public String serialize(TreeNode root) {
15            StringBuilder sb = new StringBuilder();
16            build(root, sb);
17            return sb.toString();
18        }
19
20        private void build(TreeNode root, StringBuilder sb) {
21            if (root == null) {
22                sb.append("null,");
23                return;
24            }
25            sb.append(root.val).append(",");
26            build(root.left, sb);
27            build(root.right, sb);
28        }
29
30        // Decodes your encoded data to tree.
31        public TreeNode deserialize(String data) {
32            if (data == null || data.isEmpty()) {
33                return null;
34            }
35            String[] arr = data.split(",");
36            idx = 0; // Reset index before parsing
37            return parse(arr);
38        }
39
40        private TreeNode parse(String[] arr) {
41            if (idx >= arr.length) {
42                return null;
43            }
44            String s = arr[idx++];
45            if (s.equals("null")) {
46                return null;
47            }
48        TreeNode node = new TreeNode(Integer.parseInt(s));
49        node.left = parse(arr);
50        node.right = parse(arr);
51        return node;
52    }
53}
54
55
56// Your Codec object will be instantiated and called as such:
57// Codec ser = new Codec();
58// Codec deser = new Codec();
59// TreeNode ans = deser.deserialize(ser.serialize(root));