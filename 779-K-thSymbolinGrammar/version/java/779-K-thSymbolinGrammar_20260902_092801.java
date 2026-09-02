// Last updated: 9/2/2026, 9:28:01 AM
1class Solution {
2    public int kthGrammar(int n, int k) {
3        int count=Integer.bitCount(k-1);
4        int answer=count % 2;
5        return answer;
6    }
7}
8