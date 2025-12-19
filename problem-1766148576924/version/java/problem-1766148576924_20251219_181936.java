// Last updated: 12/19/2025, 6:19:36 PM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        Map<Integer, Integer> freq=new HashMap<>();
4        Map<Integer, Integer> need=new HashMap<>();
5        for (int i=0;i<nums.length;i++) {
6            freq.put(nums[i],freq.getOrDefault(nums[i], 0) + 1);
7        }
8        for (int i=0;i<nums.length;i++) {
9            if (freq.get(nums[i])==0){
10                continue;
11            }
12            if (need.getOrDefault(nums[i], 0) > 0) {
13                need.put(nums[i], need.get(nums[i]) - 1);
14                need.put(nums[i]+ 1,need.getOrDefault(nums[i]+1,0) + 1);
15            }
16            else if(freq.getOrDefault(nums[i]+1,0)>0 && freq.getOrDefault(nums[i]+2,0)>0){
17                freq.put(nums[i]+1,freq.get(nums[i]+1)-1);
18                freq.put(nums[i]+2,freq.get(nums[i]+2)-1);
19                need.put(nums[i]+3,need.getOrDefault(nums[i] +3,0) +1);
20            }
21            else {
22                return false;
23            }
24            freq.put(nums[i],freq.get(nums[i])-1);
25        }
26        return true;
27    }
28}
29