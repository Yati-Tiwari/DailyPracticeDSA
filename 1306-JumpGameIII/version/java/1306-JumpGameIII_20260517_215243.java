// Last updated: 5/17/2026, 9:52:43 PM
1class Solution {
2    public boolean canReach(int[] arr,int start) {
3        if(start<0 || start>=arr.length || arr[start]<0) {
4            return false;
5        }
6        if(arr[start]==0) {
7            return true;
8        }
9        int jump=arr[start];
10        arr[start]=-arr[start];
11        if(canReach(arr,start+jump)) {
12            return true;
13        }
14        if(canReach(arr,start-jump)) {
15            return true;
16        }
17        return false;
18    }
19}
20