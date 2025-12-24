// Last updated: 12/24/2025, 8:01:12 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int n1=s1.length();
4        int n2=s2.length();
5        int n3=s3.length();
6        int n=Math.min(n1,Math.min(n2,n3));
7        int i=0;
8        while(i<n && s1.charAt(i)==s2.charAt(i) && s2.charAt(i) ==s3.charAt(i)){
9            i++;
10        }
11        if(i==0){
12            return -1;
13        }
14        int rslt=(n1-i)+(n2-i)+(n3-i);
15        return rslt;
16    }
17}