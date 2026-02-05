// Last updated: 2/5/2026, 3:33:01 PM
1class Solution {
2    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
3        int n=nums.length;
4        int[] ans=new int[n-k+1];
5        int[] count=new int[50]; ///.frequency array for negatives [-50, -1]
6        for(int i=0;i<n;i++) {
7            if(nums[i] < 0){
8                count[nums[i] +50]++; // add current element
9            }
10            if(i-k>=0 && nums[i-k] < 0){
11                count[nums[i-k] + 50]--; // remove outgoing element
12            }
13            if(i+1>=k){
14                ans[i+1-k]=Beauty(count,x);
15            }
16        }
17        return ans;
18    }
19    private int Beauty(int[] count,int x) { // Beauty:getXthSmallestNum
20        int prefix=0;
21        for (int i=0; i<50; ++i) {
22            prefix +=count[i];
23            if (prefix >=x){
24                return i-50; ///map back to negative number
25            }
26        }
27        return 0; // fewer than x negatives
28    }
29}