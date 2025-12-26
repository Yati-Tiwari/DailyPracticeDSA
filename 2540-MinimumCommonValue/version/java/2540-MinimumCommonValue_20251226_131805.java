// Last updated: 12/26/2025, 1:18:05 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3       int i=0;
4       int j=0;
5       while(i<nums1.length && j<nums2.length){
6        if(nums1[i]==nums2[j]){
7            return nums1[i];
8        }
9        else if(nums1[i]<nums2[j]){
10            i++;
11        }else{
12            j++;
13        }
14       }
15       return -1;
16    }
17}