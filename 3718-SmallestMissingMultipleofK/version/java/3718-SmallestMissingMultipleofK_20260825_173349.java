// Last updated: 8/25/2026, 5:33:49 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5           set.add(nums[i]);
6        }
7        int ans=k;
8        while(set.contains(ans)){
9            ans+=k;
10        }
11        return ans;
12    }
13}