// Last updated: 8/12/2026, 8:28:19 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        Deque<Integer> q=new ArrayDeque<>();
4        int[] RESULT= new int[nums.length-k+1];
5        int l=0;
6        int r=0;
7        int i=0;
8        while(r<nums.length) {
9            while(!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
10                q.pollLast();
11            }
12            q.addLast(r);
13            if(q.peekFirst()<l) {
14                q.pollFirst();
15            }
16            if(r-l+1 >= k) {
17                RESULT[i++]=nums[q.peekFirst()];
18                l++; 
19            }
20            r++;
21        }
22        return RESULT;
23    }
24}