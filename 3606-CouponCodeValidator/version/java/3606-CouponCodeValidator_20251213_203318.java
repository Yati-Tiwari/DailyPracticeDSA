// Last updated: 12/13/2025, 8:33:18 PM
1class Solution {
2    public int numberOfPairs(int[][] points) {
3        int n=points.length;
4        Arrays.sort(points,(a,b) ->{
5            if (a[0]!=b[0]){
6                return a[0]-b[0];
7            }
8            return b[1]-a[1];
9        });
10        int ans=0;
11        for (int i=0;i<n;i++) {
12            int maxY=Integer.MIN_VALUE;
13            for (int j=i+1; j<n;j++) {
14                if (points[j][1]<=points[i][1]) {
15                    if (points[j][1] > maxY) {
16                        ans++;
17                        maxY=points[j][1];
18                    }
19                }
20            }
21        }
22        return ans;
23    }
24}
25