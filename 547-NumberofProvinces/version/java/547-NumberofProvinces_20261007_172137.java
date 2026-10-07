// Last updated: 10/7/2026, 5:21:37 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n=isConnected.length;
4        int ans=0;
5        boolean[] visited=new boolean[n];
6        for(int i=0; i<n; i++){
7            if(!visited[i]){
8                dfs(isConnected,visited,i);
9                ans++;
10            }
11        }
12        return ans;
13    }
14    public void dfs(int[][] isConnected,boolean[] visited,int i){
15        if(visited[i]){
16            return;
17        }
18        visited[i]=true;
19        for(int j=0; j<isConnected.length; j++){
20            if(isConnected[i][j]==1){
21                dfs(isConnected,visited,j);
22            }
23        }
24    }
25}