// Last updated: 2/1/2026, 8:57:38 PM
1class Solution {
2    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
3        int mod=1000000007; 
4        int n=nums1.length;
5        int[] nums=new int[n]; // copy kiya  nums1 for sorting
6        long sum=0;
7        //Calculate initial sum of absolute differences
8        for (int i=0; i < n; i++) {
9            sum+=Math.abs(nums1[i]-nums2[i]); // difference for each index
10            nums[i]=nums1[i]; // copy nums1 into nums
11        }
12
13        //Sort nums (copy of nums1) for binary search
14        Arrays.sort(nums);
15        long min=sum; // initialize minimum possible sum
16        //Try to minimize the difference by replacing one element in nums1
17        for (int i=0; i<n; i++) {
18            int curr=Math.abs(nums1[i]-nums2[i]); // current difference at index 
19            // Binary search to find closest value in nums to nums2[i]
20            int l=0;
21            int hi=n-1;
22            while (l <hi) {
23                int mid=(l+hi) / 2;
24                if (nums[mid]<nums2[i]){
25                    l=mid+1;
26                }
27                else{
28                    hi=mid;
29                }
30            }
31            // Best possible replacement difference
32            int bst=Math.min(curr, Math.abs(nums[l]-nums2[i]));
33            // Check the previous element (lo-1) as it might be closer
34            if (l >0){
35                bst=Math.min(bst,Math.abs(nums[l-1]-nums2[i]));
36            }
37            // Update minimum sum: remove old difference, add new best difference
38            min=Math.min(min,sum-curr+bst);
39        }
40        // Return result modulo 1e9+7
41        return (int)(min % mod);
42    }
43}