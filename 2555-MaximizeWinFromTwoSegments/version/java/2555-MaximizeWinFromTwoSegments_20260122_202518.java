// Last updated: 1/22/2026, 8:25:18 PM
1class Solution {
2    public int maximizeWin(int[] prizePositions, int k) {
3        int n=prizePositions.length;
4        int[] f=new int[n+1];
5        int ans=0;
6        for (int i=1; i<=n; ++i) {
7            int x=prizePositions[i-1];
8            int y=search(prizePositions, x-k);
9            ans=Math.max(ans,f[y] + i-y);
10            f[i]=Math.max(f[i-1], i-y);
11        }
12        return ans;
13    }
14    public int search(int[] nums,int x) {
15        int left=0,right=nums.length;
16        while (left < right) {
17            int mid=(left + right)/2;
18            if (nums[mid]>=x) {
19                right=mid;
20            } else {
21                left=mid+1;
22            }
23        }
24        return left;
25    }
26}