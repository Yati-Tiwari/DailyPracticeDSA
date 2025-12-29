// Last updated: 12/29/2025, 8:17:41 PM
1class Solution {
2    public int findLengthOfShortestSubarray(int[] arr) {
3        int n=arr.length;
4        int l=0;
5        while(l+1<n && arr[l]<=arr[l+1]){
6            l++;
7        }
8        if(l==n-1){
9            return 0;
10        }
11        int r=n-1;
12        while(r>0 && arr[r-1]<=arr[r]){
13            r--;
14        }
15
16        int rslt=Math.min(n-l-1,r);
17        int i=0,j=r;
18        while(i<=l && j<n){
19            if(arr[i]<=arr[j]){
20                rslt=Math.min(rslt,j-i-1);
21                i++;
22            }
23            else{
24                j++;
25            }
26        }
27        return rslt;
28    }
29}