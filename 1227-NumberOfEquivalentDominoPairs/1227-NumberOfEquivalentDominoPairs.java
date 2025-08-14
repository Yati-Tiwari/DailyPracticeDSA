// Last updated: 8/14/2025, 11:20:37 AM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] Count=new int[100]; 
        int Rslt=0;
        for (int i=0; i < dominoes.length; i++) {
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            int val = Math.min(a, b) * 10 + Math.max(a, b); 
            Rslt+= Count[val];
            Count[val]++;
        }
        return Rslt;
    }
}
