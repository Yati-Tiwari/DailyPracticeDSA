// Last updated: 2/4/2026, 11:17:40 AM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> st=new Stack<>(); 
4        int ans=0;
5        for (int i=0;i<nums.length;i++) {
6            int a=nums[i];
7            int steps=0;
8            while (!st.isEmpty() && st.peek()[0]<=a) {
9                steps = Math.max(steps,st.peek()[1]);
10                st.pop();
11            }
12            if (!st.isEmpty()){
13                steps++;
14            }
15            ans=Math.max(ans,steps);
16            st.push(new int[]{a,steps});
17        }
18        return ans;
19    }
20}