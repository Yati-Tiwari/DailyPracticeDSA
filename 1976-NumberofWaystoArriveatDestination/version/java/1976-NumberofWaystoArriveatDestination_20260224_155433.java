// Last updated: 2/24/2026, 3:54:33 PM
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3
4        // graph: node -> (neighbor -> cost)
5        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();
6
7        // initialize
8        for (int i=0; i<n; i++) {
9            graph.put(i, new HashMap<>());
10        }
11        for (int[] r : roads) {
12            graph.get(r[0]).put(r[1], r[2]);
13            graph.get(r[1]).put(r[0], r[2]);
14        }
15
16        long[] dist=new long[n];
17        int[] ways=new int[n];
18
19        Arrays.fill(dist, Long.MAX_VALUE);
20        dist[0]=0;
21        ways[0]=1;
22        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1])
23        );
24
25        pq.add(new long[]{0, 0});
26        int mod=1000000007;
27        while (!pq.isEmpty()) {
28            long[] curr = pq.poll();
29            int node=(int) curr[0];
30            long d=curr[1];
31            if (d > dist[node]) continue;
32            for (int nbr : graph.get(node).keySet()) {
33                long newDist=d+graph.get(node).get(nbr);
34                if (newDist < dist[nbr]) {
35                    dist[nbr]=newDist;
36                    ways[nbr]=ways[node];
37                    pq.add(new long[]{nbr,newDist});
38                } 
39                else if (newDist==dist[nbr]) {
40                    ways[nbr]=(ways[nbr] + ways[node]) % mod;
41                }
42            }
43        }
44
45        return ways[n-1];
46    }
47}