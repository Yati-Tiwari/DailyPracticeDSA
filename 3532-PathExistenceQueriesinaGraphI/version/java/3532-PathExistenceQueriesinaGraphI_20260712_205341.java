// Last updated: 7/12/2026, 8:53:41 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        List<Integer> ll=new ArrayList<>();
4        ll.add(0);
5        for (int i=1; i<n; i++) {
6            if (nums[i] -nums[i-1] > maxDiff) {
7                ll.add(i);
8            }
9        }
10        boolean[] ans=new boolean[queries.length];
11        for (int i=0; i<queries.length;i++) {
12            int start=queries[i][0]+ 1;
13            int end=queries[i][1]+1;
14            //bianry  search start k liye
15            int x=Collections.binarySearch(ll,start);
16            if (x<0) {
17                x =-x -1; 
18            }
19            //binary search for end
20            int y=Collections.binarySearch(ll,end);
21            if (y<0) {
22                y = -y-1;
23            }
24            // if both belong to samesegment path exists
25            ans[i]= (x==y);
26        }
27        return ans;
28    }
29}
30