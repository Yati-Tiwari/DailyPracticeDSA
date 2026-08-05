// Last updated: 8/5/2026, 10:01:40 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        Set<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(set.contains(nums[i])){
6                return true;
7            }
8            set.add(nums[i]);
9            if(set.size()>k){
10                set.remove(nums[i-k]);
11            }
12        }
13        return false;
14    }
15}