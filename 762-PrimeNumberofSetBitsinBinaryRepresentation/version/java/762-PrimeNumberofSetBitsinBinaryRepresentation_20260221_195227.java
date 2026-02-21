// Last updated: 2/21/2026, 7:52:27 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count=0;
4        for (int i=left; i<=right; i++) {
5            int setBits=Integer.bitCount(i);
6            if (isPrime(setBits)) {
7                count++;
8            }
9        }
10        return count;
11    }
12    private boolean isPrime(int n) {
13        if(n<2){
14            return false;
15        }
16        if(n==2 || n==3){
17            return true;
18        }
19        if(n % 2==0){
20            return false;
21        }
22        for(int i=3;i*i<=n; i+=2) {
23            if(n % i==0){
24                return false;
25            }
26        }
27        return true;
28    }
29}