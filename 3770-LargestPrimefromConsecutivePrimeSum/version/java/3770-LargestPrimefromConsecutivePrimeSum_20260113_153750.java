// Last updated: 1/13/2026, 3:37:50 PM
1class Solution {
2    public int largestPrime(int n) {
3        int[] prime=prime(n+1);
4        int ans=0;
5        int sum=0;
6        for(int i=0;i<=n;i++){
7            if(prime[i]==0)
8                sum+=i;
9            if(sum>n) break;
10            if(prime[sum]==0){
11                ans=sum;
12            }
13        }
14        return ans;
15    }
16    public int[] prime( int n) {
17        int[] ans=new int[n];
18        ans[0]=ans[1]=1; //not prime
19        for(int i=2;i*i<n;i++){ 
20            if(ans[i]==0){ //check is it composite
21                for(int j=2;j*i<n;j++){
22                    ans[i*j]=1;
23                }
24            }
25        }
26        return ans;
27    }
28}