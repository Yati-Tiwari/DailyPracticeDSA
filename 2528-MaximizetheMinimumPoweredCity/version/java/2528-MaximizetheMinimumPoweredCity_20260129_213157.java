// Last updated: 1/29/2026, 9:31:57 PM
1class Solution {
2    public long maxPower(int[] stations, int r, int k) {
3        long low=0;
4        long high=0;
5        //maximum possible power (safe upper bound hai)
6        for(int i=0;i<stations.length;i++) {
7            int x=stations[i];
8            high+=x;
9        }
10        high+=k;
11        //binary search answer pr
12        while(low<=high) {
13            long mid=low+(high-low) / 2;
14            if(Powered(stations,r,k,mid)) {
15                low=mid+1;   // try bigger minimum power
16            }else {
17                high=mid-1;  // jb mid not possible
18            }
19        }
20        return high;
21    }
22    // check function bnaya
23    public boolean Powered(int[] stations, int r, int k, long target) {
24        int n=stations.length;
25        long[] add=new long[n]; // extra stations added
26        long currPower=0;
27
28        // initial window
29        for (int j=0;j<=r && j<n;j++) {
30            currPower+=stations[j];
31        }
32        for (int j=0;j<n;j++) {
33            // if power kam hai
34            if(currPower < target) {
35                long need=target-currPower;
36                if(need > k){
37                    return false;
38                }
39                k-=need;
40                currPower+=need;
41                int pos=Math.min(n-1,j+r);
42                add[pos]+=need;
43            }
44            // window move
45            if (j-r>= 0) {
46                currPower-=stations[j-r];
47                currPower-=add[j-r];
48            }
49            if(j+r+1<n){
50                currPower+=stations[j+r+1];
51            }
52        }
53        return true;
54    }
55}
56