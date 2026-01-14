// Last updated: 1/14/2026, 9:13:24 PM
1class Solution {
2    public int maxOperations(int[] nums) {
3        int n=nums.length;
4        int [][] dp=new int[n][n];
5        return Score(nums,0,n-1,0,dp);
6    }
7    static int Score(int[] nums,int i,int j,int prev,int[][] dp){
8        if(i>=j){
9            return 0;
10        }
11        if(dp[i][j] != 0){
12            return dp[i][j];
13        }
14        int x=0;
15        int y=0;
16        int z=0;
17        if(prev==0 || nums[i]+nums[i+1]==prev){
18            x=1+Score(nums,i+2,j,nums[i]+nums[i+1],dp);
19        }
20        if(prev==0 || nums[j]+nums[j-1]==prev){
21            y=1+Score(nums,i,j-2,nums[j]+ nums[j-1],dp);
22        }
23        if(prev==0 || nums[i]+nums[j]== prev){
24            z= 1+Score(nums,i+1,j-1,nums[i]+nums[j], dp);
25        }
26        int temp=Math.max(y,z);
27        int ans=Math.max(x,temp);
28        dp[i][j]=ans;
29        return ans;
30
31    }
32    
33}