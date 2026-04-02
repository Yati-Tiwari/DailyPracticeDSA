// Last updated: 4/2/2026, 11:35:32 AM
1class Solution {
2    public int movesToMakeZigzag(int[] nums) {
3        return Math.min(Print(nums,0),Print(nums,1));
4    }
5    private int Print(int[] nums,int start){
6        int moves=0;
7        for(int i=start; i < nums.length; i+=2){
8            int left=Integer.MAX_VALUE;
9            int right=Integer.MAX_VALUE;
10            if(i > 0) {
11                left=nums[i-1];
12            }
13            if (i+1 < nums.length) {
14                right=nums[i+1];
15            }
16            
17            int minNeighbor=left;
18            if(right < minNeighbor) {
19                minNeighbor=right;
20            }
21            
22            if(nums[i] >=minNeighbor) {
23                moves +=nums[i]-minNeighbor+1;
24            }
25        }
26        return moves;
27    }
28}
29