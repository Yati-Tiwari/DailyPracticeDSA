// Last updated: 4/14/2026, 10:22:51 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int N=nums.length;
4        int[] result=new int[N];
5        for (int i=0;i<N;i++) {
6            int Next=-1;
7            for (int j=1;j<N;j++) {
8                int idx=(i+j) % N;
9                if (nums[idx]>nums[i]) {
10                    Next=nums[idx];
11                    break;
12                }
13            }
14            result[i]=Next;
15        }
16        return result;
17    }
18}
19