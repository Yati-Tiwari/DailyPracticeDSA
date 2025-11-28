// Last updated: 11/28/2025, 6:44:34 PM
1class Solution {
2    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
3        List<Integer>[] graph=new ArrayList[n];
4        for(int i = 0; i < n; i++) {
5            graph[i]=new ArrayList<>();
6        }
7        for(int[] e : edges) {
8            graph[e[0]].add(e[1]);
9            graph[e[1]].add(e[0]);
10        }
11        int[] ans=new int[1];
12        boolean[] visited=new boolean[n];
13        dfs(0, graph,values,k,visited,ans);
14        return ans[0];
15    }
16    private long dfs(int node,List<Integer>[]graph,int[] values,int k,
17                     boolean[] visited, int[] ans) {
18        visited[node]=true;
19        long sum=values[node];
20        for(int nbr : graph[node]) {
21            if(!visited[nbr]) {
22                sum += dfs(nbr, graph,values,k, visited,ans);
23            }
24        }
25        if(sum % k ==0) {
26            ans[0]++;  
27            return 0;   
28        }
29        return sum;
30    }
31}
32