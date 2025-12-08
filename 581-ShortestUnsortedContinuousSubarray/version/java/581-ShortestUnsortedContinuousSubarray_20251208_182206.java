// Last updated: 12/8/2025, 6:22:06 PM
1class Solution{
2    public int findUnsortedSubarray(int[] nums){
3        int n=nums.length;
4        int l=0;
5        int r=-1;
6        int max=Integer.MIN_VALUE;
7        int min=Integer.MAX_VALUE;
8        for(int i=0;i<n;i++){
9            if(nums[i]<max){
10                r=i;
11            }
12            else {
13                max=nums[i];
14            }
15        }
16        for(int i=n-1;i>=0;i--){
17            if(nums[i]>min){
18                l=i;
19            }
20            else{
21                min=nums[i];
22            }
23        }
24        int result= r-l+1;
25        return result;
26    }
27}
28