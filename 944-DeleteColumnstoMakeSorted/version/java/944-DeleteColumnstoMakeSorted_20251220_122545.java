// Last updated: 12/20/2025, 12:25:45 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int rows=strs.length;
4        int cols=strs[0].length();
5        int c=0;
6        for (int column=0;column<cols; column++) {
7            for (int row=1; row<rows;row++) {
8                if (strs[row].charAt(column) < strs[row-1].charAt(column)) {
9                    c++;
10                    break;
11                }
12            }
13        }
14        return c;
15    }
16}
17