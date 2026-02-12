// Last updated: 2/12/2026, 12:19:03 PM
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3        int[][] q = new int[queries.length][3];
4        for (int i = 0; i < q.length; i++) {
5            q[i][0] = queries[i][0]; // xi
6            q[i][1] = queries[i][1]; // mi
7            q[i][2] = i;             // index
8        }
9        Arrays.sort(q, (a, b) -> a[1] - b[1]);
10        Arrays.sort(arr);
11        int[] ans = new int[q.length];
12        Trie t = new Trie();
13        int j = 0;
14        for (int[] a : q) {
15            while (j < arr.length && arr[j] <= a[1]) {
16                t.add(arr[j]);
17                j++;
18            }
19            if (j == 0) {
20                ans[a[2]] = -1;
21            } else {
22                ans[a[2]] = t.getMaxXor(a[0]);
23            }
24        }
25        return ans;
26    }
27
28    static class Trie {
29        class Node {
30            Node zero;
31            Node one;
32        }
33        private Node root = new Node();
34
35        public void add(int val) {
36            Node curr = root;
37            for (int i = 31; i >= 0; i--) {
38                int bit = (val >> i) & 1;
39                if (bit == 0) {
40                    if (curr.zero == null) curr.zero = new Node();
41                    curr = curr.zero;
42                } else {
43                    if (curr.one == null) curr.one = new Node();
44                    curr = curr.one;
45                }
46            }
47        }
48        public int getMaxXor(int x) {
49            int ans = 0;
50            Node curr = root;
51            for (int i = 31; i >= 0; i--) {
52                int bit = (x >> i) & 1;
53                if (bit == 0) {
54                    if (curr.one != null) {
55                        ans |= (1 << i);
56                        curr = curr.one;
57                    } else {
58                        curr = curr.zero;
59                    }
60                } else {
61                    if (curr.zero != null) {
62                        ans |= (1 << i);
63                        curr = curr.zero;
64                    } else {
65                        curr = curr.one;
66                    }
67                }
68            }
69            return ans;
70        }
71    }
72}