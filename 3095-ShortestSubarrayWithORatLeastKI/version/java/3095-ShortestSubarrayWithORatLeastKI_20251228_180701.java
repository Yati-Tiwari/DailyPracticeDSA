// Last updated: 12/28/2025, 6:07:01 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int n=nums.length;
4        int rslt=Integer.MAX_VALUE; //abhi rslt ko max rakha,baad mei min nikalne k liye
5        for(int i=0;i<n;i++){
6            int or=0; // every new i k liye OR reset krenge
7            for(int j=i;j<n;j++){
8                or=or | nums[j]; //bitwisw oR
9                if(or>=k){
10                    rslt=Math.min(rslt,j-i+1); // subarray length ke rslt ko update
11                    break; // j ko badane ka fayda nhin hoga
12                }
13            }
14        }
15        if(rslt==Integer.MAX_VALUE){
16            return -1;
17        }else{
18            return rslt;
19        }
20    }
21}