// Last updated: 11/26/2025, 9:14:37 PM
1class Solution {
2    public int[] lexSmallestNegatedPerm(int n, long target) {
3        long k=(long) n*(n+1)/2;
4        if ((k - target) % 2 != 0) {
5            return new int[0];
6        }
7        long p=(k-target) / 2;
8        if (p < 0) {
9            return new int[0];
10        }
11        int[] Perm=new int[n];
12        for(int i=n;i>=1;i--){
13            if(p>=i){
14                Perm[i-1]=-i;
15                p-=i;
16            }else{
17                Perm[i-1]=i;
18            }
19        }
20        Arrays.sort(Perm);
21        if(p!=0) {
22            return new int[0];
23        }
24        return Perm;
25    }
26}