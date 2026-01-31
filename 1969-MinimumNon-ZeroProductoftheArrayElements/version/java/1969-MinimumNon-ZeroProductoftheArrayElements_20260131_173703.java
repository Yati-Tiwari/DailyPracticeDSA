// Last updated: 1/31/2026, 5:37:03 PM
1class Solution {
2    public int minNonZeroProduct(int p) {
3        long MOD=1000000007;
4        //// 2^p calculate using Math.pow (convert to long)
5        long twoPowerP=1;
6        for(int i=0; i<p; i++){
7            twoPowerP=twoPowerP *2;
8        }
9        long max=twoPowerP-1;          //. (2^p - 1)
10        long base=max-1;       // (2^p - 2)
11        // exponent=2^(p-1) - 1
12        long exp=1;
13        for(int i=0; i<p-1; i++){
14            exp=exp *2;
15        }
16        exp=exp-1;
17
18        long powerPart=modPow(base,exp,MOD);
19        long ans=(max % MOD * powerPart % MOD) % MOD;
20        return (int) ans;
21    }
22
23    // fast power without bit shifting
24    private long modPow(long a,long b,long MOD){
25        long rslt=1;
26        a=a % MOD;
27        while(b > 0){
28            if(b % 2==1){
29                rslt=(rslt*a) % MOD;
30            }
31            a=(a*a) % MOD;
32            b=b/2;
33        }
34        return rslt;
35    }
36}