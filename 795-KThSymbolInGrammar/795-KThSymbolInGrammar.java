// Last updated: 8/14/2025, 11:22:02 AM
class Solution {
    public int kthGrammar(int n, int k) {
        int count=Integer.bitCount(k-1);
        int answer=count % 2;
        return answer;
    }
}
