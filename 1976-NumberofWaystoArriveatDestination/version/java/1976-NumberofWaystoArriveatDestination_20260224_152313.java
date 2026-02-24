// Last updated: 2/24/2026, 3:23:13 PM
1class Solution {
2    static final int MOD=1_000_000_007;
3
4    public int countPaths(int n, int[][] roads) {
5        List<int[]>[] graph=new ArrayList[n];
6        for (int i=0; i < n; i++) graph[i]=new ArrayList<>();
7        for (int[] r : roads) {
8            graph[r[0]].add(new int[]{r[1], r[2]});
9            graph[r[1]].add(new int[]{r[0], r[2]});
10        }
11
12        long[] dist=new long[n];
13        Arrays.fill(dist, Long.MAX_VALUE);
14        int[] ways=new int[n];
15        PriorityQueue<long[]> pq=new PriorityQueue<>(Comparator.comparingLong(a->a[0]));
16
17        dist[0]=0;
18        ways[0]=1;
19        pq.add(new long[]{0,0}); 
20        while (!pq.isEmpty()) {
21            long[] cur=pq.poll();
22            long d=cur[0];
23            int node=(int) cur[1];
24            if (d > dist[node]) continue;
25            for (int[] e : graph[node]) {
26                int next=e[0];
27                long newDist=d + e[1];
28                if (newDist < dist[next]) {
29                    dist[next]=newDist;
30                    ways[next]=ways[node];
31                    pq.add(new long[]{newDist,next});
32                } 
33                else if (newDist==dist[next]) {
34                    ways[next]=(ways[next] + ways[node]) % MOD;
35                }
36            }
37        }
38        return ways[n-1];
39    }
40}