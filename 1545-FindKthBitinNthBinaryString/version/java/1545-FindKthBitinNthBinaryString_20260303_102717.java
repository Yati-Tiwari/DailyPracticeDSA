// Last updated: 3/3/2026, 10:27:17 AM
1class Solution {
2    public char findKthBit(int n, int k) {
3        if(n==1){
4            return '0'; 
5        }
6        int length=(int)Math.pow(2,n)-1;
7        int mid=(length / 2)+1;
8        if(k==mid) {
9            return '1';
10        }else if (k < mid){
11            return findKthBit(n-1, k);
12        }else{
13            char bit=findKthBit(n-1, length-k+1);
14            if(bit=='0'){
15                return '1';
16            }else{
17                return '0';
18            }
19        }
20    }
21}