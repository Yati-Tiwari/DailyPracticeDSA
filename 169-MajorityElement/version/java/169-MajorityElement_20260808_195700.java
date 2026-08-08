// Last updated: 8/8/2026, 7:57:00 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        return MajorityElement(nums);
4    }
5    public static int MajorityElement(int[] num) {
6		int e=num[0];
7		int v=1;
8		for(int i=1;i<num.length;i++) {
9			if(num[i]==e) {
10				v++;
11			}
12			else {
13				v--;
14				if(v==0) {
15					e=num[i];
16					v=1;
17				}
18			}
19		}
20		return e;
21	}
22
23}
24