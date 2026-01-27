// Last updated: 1/27/2026, 2:42:13 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int n=tickets.length;
4        int t=0;
5        for(int i=0;i<n;i++){
6            if(i<=k){
7                t+=Math.min(tickets[i],tickets[k]);
8            }
9            else{
10                t+=Math.min(tickets[i],tickets[k]-1);
11            }
12        }
13        return t;
14    }
15}