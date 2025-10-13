// Last updated: 10/13/2025, 9:12:35 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trust_num=new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            int a=trust[i][0];
            int b=trust[i][1];
            trust_num[a]--;
            trust_num[b]++;
        }
        for (int i=1; i<=n; i++) {
            if (trust_num[i]==n-1) {
                return i;
            }
        }
        return -1;
    }
}
