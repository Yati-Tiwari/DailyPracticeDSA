// Last updated: 3/5/2026, 10:05:27 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        if(nums==null || nums.length<3){
4            return false;
5        }
6        Stack<Integer> st=new Stack<>();
7        int third=Integer.MIN_VALUE;
8        for(int i=nums.length -1; i>=0; i--) {
9            if(nums[i] < third){
10                return true;
11            }
12            while(!st.isEmpty() && nums[i] > st.peek()) {
13                third=st.pop();
14            }
15            st.push(nums[i]);
16        }
17        return false;
18    }
19}