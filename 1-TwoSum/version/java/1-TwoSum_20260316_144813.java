// Last updated: 3/16/2026, 2:48:13 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n=nums.length;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            int t=target-nums[i];
7            if(!map.containsKey(t)){
8                map.put(nums[i],i);
9            }
10            else{
11                return new int[]{map.get(t),i};
12            }
13        }
14        return new int[]{};
15    }
16}