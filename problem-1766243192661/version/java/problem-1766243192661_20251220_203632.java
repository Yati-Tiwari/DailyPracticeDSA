// Last updated: 12/20/2025, 8:36:32 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        Set<Integer> ans=new HashSet<>();
4        int indx=nums.length-1;
5        while(indx>=0 && !ans.contains(nums[indx])){
6            ans.add(nums[indx]);
7            indx--;
8        }
9        int bach=indx+1;
10        int c=bach+2;
11        return c/3;
12        
13    }
14}