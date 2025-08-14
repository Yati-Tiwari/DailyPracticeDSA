// Last updated: 8/14/2025, 11:17:49 AM
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n=word.length();
        int[] divisibility=new int[n];
        long Num=0;
        for (int i = 0;i < n;i++) {
            Num=Num * 10 + (word.charAt(i) - '0');
            if (Num % m == 0) {
                divisibility[i]= 1;
            } else {
                divisibility[i]=0;
            }
            Num=Num % m; 
        }
        return divisibility;
    }
}
