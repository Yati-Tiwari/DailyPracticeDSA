// Last updated: 1/13/2026, 2:54:29 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int m=nums1.length;
4        int n=nums2.length;
5        int p1=0;
6        int p2=0;
7        int[]ans=new int[m+n];
8        int i=0;
9        while(p1<m && p2<n){
10            if(nums1[p1]<nums2[p2]){
11                ans[i]=nums1[p1];
12                i++;
13                p1++;
14            }else{
15                ans[i]=nums2[p2];
16                i++;
17                p2++;
18            }
19        }
20        while(p1<m){
21            ans[i]=nums1[p1];
22            i++;
23            p1++;
24        }
25        while(p2<n){
26            ans[i]=nums2[p2];
27            i++;
28            p2++;
29        }
30        int s=ans.length;
31        if(s%2==1){
32            return ans[s/2];
33        }else{
34            return (ans[s/2]+ans[(s/2)-1])/2.0;
35        }
36    }
37}