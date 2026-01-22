// Last updated: 1/22/2026, 9:07:55 PM
1class Solution {
2    static int MOD=1000000007;
3    public int monkeyMove(int n){
4        long pow=modPow(2,n);
5        long ans=(pow-2+MOD)%MOD;
6        return (int)ans;
7    }
8    public long modPow(long x,long n){
9        long rslt=1;
10        x%=MOD;
11        while(n>0){
12            if(n%2==1){
13                rslt=(rslt*x)%MOD;
14            }
15            x=(x*x)%MOD;
16            n=n/2;
17        }
18        return rslt;
19    }
20}
21