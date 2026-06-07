// Last updated: 6/7/2026, 4:07:20 PM
1class Solution {
2    public int maxCoins(int[] nums) {
3        // very impo...***
4        int[] arr=new int[nums.length+2];
5        int[][] dp=new int[arr.length][arr.length];
6        for(int[] d:dp){
7            Arrays.fill(d,-1);
8        }
9    arr[0]=1;
10    arr[arr.length-1]=1;
11    for(int i=0;i<nums.length;i++){
12        arr[i+1]=nums[i];
13    }
14        return maxCoin(arr,0,arr.length-1,dp);    
15    }
16    public static int maxCoin(int[] arr, int i, int j,int[][] dp) {
17		if(i+1==j) { 
18			return 0;
19		}
20		if(dp[i][j]!=-1){
21			return dp[i][j];
22		}
23		int ans=Integer.MIN_VALUE;
24		for(int k=i+1;k<j;k++) {
25			int fs=maxCoin(arr,i,k,dp); 
26			int ss=maxCoin(arr,k,j,dp); 
27			int self=arr[i]*arr[k]*arr[j];
28			ans=Math.max(ans, self+fs+ss);
29		}
30		return dp[i][j]=ans;
31	}
32}