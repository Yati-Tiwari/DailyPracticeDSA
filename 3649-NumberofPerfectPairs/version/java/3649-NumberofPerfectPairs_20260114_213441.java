// Last updated: 1/14/2026, 9:34:41 PM
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n=nums.length;
4        long ans=0;
5        long[] arr=new long[n];
6        for (int i=0;i<n;i++) {
7            arr[i]=Math.abs(nums[i]);
8        }
9        Arrays.sort(arr);
10        int left=0;
11        for (int i=0;i<n;i++) {
12        //move left pointerjb tk valid
13            while (left<i && arr[i] > 2*arr[left]) {
14                left++;
15            }
16            //all indices [left,i-1] are valid
17            ans+=(i-left);
18        }
19        return ans;
20    }
21}
22