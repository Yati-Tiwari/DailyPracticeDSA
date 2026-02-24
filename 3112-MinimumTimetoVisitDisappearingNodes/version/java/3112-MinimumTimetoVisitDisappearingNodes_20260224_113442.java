// Last updated: 2/24/2026, 11:34:42 AM
1class Solution {
2    private HashMap<Integer, HashMap<Integer, Integer>> map;
3    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
4        map = new HashMap<>();
5        for (int i = 0; i < n; i++) {
6            map.put(i, new HashMap<>());
7        }
8        // add edges
9        for (int[] e : edges) {
10            AddEdge(e[0], e[1], e[2]);
11        }
12        return Dijkstra(n, disappear);
13    }
14
15    public void AddEdge(int v1, int v2, int cost) {
16        map.get(v1).put(v2,
17            Math.min(map.get(v1).getOrDefault(v2, Integer.MAX_VALUE), cost));
18        map.get(v2).put(v1,
19            Math.min(map.get(v2).getOrDefault(v1, Integer.MAX_VALUE), cost));
20    }
21    class DijkstraPair {
22        int vtx;
23        int cost;
24        public DijkstraPair(int vtx, int cost) {
25            this.vtx = vtx;
26            this.cost = cost;
27        }
28    }
29    public int[] Dijkstra(int n, int[] disappear) {
30        int[] ans = new int[n];
31        Arrays.fill(ans, -1);
32        PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a, b) -> a.cost-b.cost);
33        boolean[] visited = new boolean[n];
34        pq.add(new DijkstraPair(0, 0));
35        while (!pq.isEmpty()) {
36            DijkstraPair rp = pq.poll();
37            if (visited[rp.vtx]) continue;
38            // vanish check
39            if (rp.cost >= disappear[rp.vtx]) continue;
40            visited[rp.vtx] = true;
41            ans[rp.vtx] = rp.cost;
42            for (int nbr : map.get(rp.vtx).keySet()) {
43                if (!visited[nbr]) {
44                    int newCost = rp.cost + map.get(rp.vtx).get(nbr);
45                    pq.add(new DijkstraPair(nbr, newCost));
46                }
47            }
48        }
49        return ans;
50    }
51}