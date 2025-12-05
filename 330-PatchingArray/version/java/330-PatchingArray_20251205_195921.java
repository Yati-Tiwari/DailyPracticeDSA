// Last updated: 12/5/2025, 7:59:21 PM
1class Solution {
2    public int minPatches(int[] nums,int n) {
3        long miss=1; 
4        int i=0;
5        int added=0;
6        while (miss<=n) {
7            if (i<nums.length && nums[i]<=miss) {
8                miss+=nums[i];
9                i++;
10            } else {
11                miss +=miss; 
12                added++;
13            }
14        }
15        return added;
16    }
17}
18