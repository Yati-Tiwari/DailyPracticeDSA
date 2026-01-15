// Last updated: 1/15/2026, 9:00:40 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        long ans=0;
4        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
5        for (int i=0;i<nums.length;i++) {
6            int x=nums[i];
7            char ch=s.charAt(i);
8            pq.add(x);
9            if (ch=='1') {
10                ans+=pq.poll();
11            }
12        }
13        return ans;
14    }
15}