// Last updated: 12/12/2025, 6:51:41 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n=directions.length();
4        int count=0;
5        int i=0,j=n-1;
6        while (i < n && directions.charAt(i)=='L'){
7            i++;
8        }
9        while (j >= 0 && directions.charAt(j)=='R'){
10            j--;
11        }
12        for (int k=i; k<=j;k++) {
13            if (directions.charAt(k) != 'S'){
14                count++;
15            }
16        }
17
18        return count;
19    }
20}
21