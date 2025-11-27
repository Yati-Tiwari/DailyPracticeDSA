// Last updated: 11/27/2025, 9:47:01 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        HashMap<Integer, List<Integer>> map=new HashMap<>();
4        for (int i=0; i<numCourses; i++) {
5            map.put(i,new ArrayList<>());
6        }
7        int[] indegree=new int[numCourses];
8        for (int[] p : prerequisites) {
9            int course=p[0];    
10            int pre=p[1];
11            map.get(pre).add(course);
12            indegree[course]++;    
13        }
14        Queue<Integer> q=new LinkedList<>();
15        for (int i=0; i < numCourses; i++) {
16            if (indegree[i]==0) {
17                q.add(i);
18            }
19        }
20        int count=0;
21        while (!q.isEmpty()) {
22            int curr=q.poll();
23            count++;                
24            for (int next : map.get(curr)) {
25                indegree[next]--;  
26                if (indegree[next]==0) {
27                    q.add(next);
28                }
29            }
30        }
31        return count==numCourses;
32    }
33}
34