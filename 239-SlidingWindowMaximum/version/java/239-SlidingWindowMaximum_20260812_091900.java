// Last updated: 8/12/2026, 9:19:00 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n=nums.length;
4        int[] left=new int[n];
5        int[] right=new int[n];
6
7        left[0]=nums[0];
8        right[n-1]=nums[n-1];
9        for(int i=1; i<n; i++){
10            // left: from start of block to current index
11            if(i % k==0){
12                left[i]=nums[i]; // block boundary
13            }else{
14                left[i]=Math.max(left[i-1],nums[i]);
15            }
16            // right: from end of block to current index
17            int j=n-1-i;
18            if((j+1) % k==0){
19                right[j]=nums[j]; // block boundary
20            }else{
21                right[j]=Math.max(right[j+1],nums[j]);
22            }
23        }
24
25        // Generate result
26        int[] result = new int[n - k + 1];
27        for (int i = 0; i <= n - k; i++) {
28            result[i] = Math.max(right[i], left[i + k - 1]);
29        }
30
31        return result;
32    }
33}