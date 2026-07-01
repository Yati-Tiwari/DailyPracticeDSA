// Last updated: 7/1/2026, 7:12:47 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n=directions.length();
4        int count=0;
5        int i=0;
6        int j=n-1;
7        while (i < n && directions.charAt(i)=='L'){
8            i++;
9        }
10        while (j >= 0 && directions.charAt(j)=='R'){
11            j--;
12        }
13        for (int k=i; k<=j;k++) {
14            if (directions.charAt(k) != 'S'){
15                count++;
16            }
17        }
18        return count;
19    }
20}
21