// Last updated: 7/6/2026, 9:03:48 AM
1class Solution {
2    public String removeTrailingZeros(String num) {
3        int end=num.length()-1;
4        while(end>=0 && num.charAt(end)=='0'){
5            end--;
6        }
7        return num.substring(0,end+1);
8    }
9}