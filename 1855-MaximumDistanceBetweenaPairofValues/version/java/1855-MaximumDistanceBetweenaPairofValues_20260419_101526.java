// Last updated: 4/19/2026, 10:15:26 AM
1class Solution {
2    public int maxDistance(int[] nums1,int[] nums2) {
3        int i=0,j=0;
4        int maxDist=0;
5        while(i<nums1.length && j<nums2.length){
6            if(nums1[i]<=nums2[j]){
7                maxDist=Math.max(maxDist, j-i);
8                j++;
9            }else{
10                i++; 
11            }
12        }
13        return maxDist;
14    }
15}
16