// Last updated: 11/30/2025, 8:47:25 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        int lgth=nums.length;
4        if(k==0){
5            return lgth;
6        }
7        if(k>lgth){
8            return 0;
9        }
10        Arrays.sort(nums);
11        int reks=nums[lgth-k];
12        int count=0;
13        for(int i=lgth-1;i>=0;i--){
14            if(nums[i]<reks){
15                count++;
16            }
17        }
18        return count;
19        
20    }
21}