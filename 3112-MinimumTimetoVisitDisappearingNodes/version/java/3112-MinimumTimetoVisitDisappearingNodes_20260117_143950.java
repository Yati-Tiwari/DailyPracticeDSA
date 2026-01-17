// Last updated: 1/17/2026, 2:39:50 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>> graph=new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            graph.add(new ArrayList<>());
6        }
7        for(int[] e : edges) {
8            int u=e[0],v=e[1];
9            int w =e[2];
10            graph.get(u).add(new int[]{v, w});
11            graph.get(v).add(new int[]{u, w});
12        }
13        // PQ for Dijkstra
14        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[1]-b[1]);
15        int[] dist=new int[n];
16        Arrays.fill(dist,Integer.MAX_VALUE);
17        //start at node 0
18        dist[0]=0;
19        pq.add(new int[]{0, 0}); // {node,time}
20        //step-3 to Step-5: Process
21        while(!pq.isEmpty()) {
22            int[] cur=pq.poll();
23            int u = cur[0], t = cur[1];
24            // Already found a better time
25            if(t > dist[u]){
26                continue;
27            }
28
29            // Node already disappeared
30            if(t >=disappear[u]){
31                continue;
32            }
33            // Check neighbors
34            for (int[] nbrs : graph.get(u)) {
35                int v=nbrs[0];
36                int w=nbrs[1];
37                int nt=t+w; // new time
38                // If better and not disappeared
39                if (nt < dist[v] && nt<disappear[v]) {
40                    dist[v]=nt;
41                    pq.offer(new int[]{v,nt});
42                }
43            }
44        }
45        // Convert unreachable nodes to -1
46        for(int i=0; i <n; i++) {
47            if(dist[i]==Integer.MAX_VALUE){
48                dist[i]= -1;
49            }
50        }
51        return dist;
52    }
53}
54