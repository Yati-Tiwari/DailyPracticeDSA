// Last updated: 4/1/2026, 12:13:19 PM
1import java.util.*;
2
3class Solution {
4    private HashMap<Integer, List<Integer>> map;
5    public int[] findOrder(int numCourses, int[][] prerequisites) {
6        map=new HashMap<>();
7        for (int i=0; i<numCourses; i++) {
8            map.put(i,new ArrayList<>());
9        }
10        for (int[] p : prerequisites) {
11            map.get(p[1]).add(p[0]);
12        }
13        // indegree array
14        int[] indeg=new int[numCourses];
15        for (int u : map.keySet()) {
16            for (int v : map.get(u)) {
17                indeg[v]++;
18            }
19        }
20        Queue<Integer> q=new LinkedList<>();
21        for (int i=0; i<numCourses; i++) {
22            if (indeg[i]==0) {
23                q.add(i);
24            }
25        }
26        int[] order=new int[numCourses];
27        int idx=0;
28        while (!q.isEmpty()) {
29            //1: REMOVE
30            int node=q.poll();
31            //3: MARK
32            order[idx++]=node;
33            //4: SELF WORK
34            for (int nbr : map.get(node)) {
35                indeg[nbr]--;
36                // 5: ADD UNVISITED
37                if (indeg[nbr]==0) {
38                    q.add(nbr);
39                }
40            }
41        }
42        if(idx != numCourses){
43            return new int[0];
44        }
45        return order;
46    }
47}
48