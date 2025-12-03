// Last updated: 12/3/2025, 12:27:08 PM
1class Solution {
2    public int findSmallestInteger(int[] nums, int value) {
3        int[] freq=new int[value];
4        for(int i=0;i<nums.length;i++) {
5            int r=((nums[i] % value)+value) % value;
6            freq[r]++;
7        }
8        int max=0;
9        while (true) {
10            int r=max % value;
11            if (freq[r]==0) {
12                break;
13            }
14            freq[r]--;
15            max++;
16        }
17        return max;
18    }
19}
20