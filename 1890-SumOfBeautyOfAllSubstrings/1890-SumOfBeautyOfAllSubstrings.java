// Last updated: 8/14/2025, 11:19:26 AM
public class Solution {
    public int beautySum(String s) {
        int totalBeauty=0;
        int n=s.length();
        for (int i=0;i<n;i++) {
            int[] frequency=new int[26];
            for (int j=i;j<n;j++) {
                frequency[s.charAt(j)-'a']++;
                int maxFreq=0;
                int minFreq=n;
                for (int k=0;k < 26;k++) {
                    if (frequency[k] > 0) {
                        maxFreq=Math.max(maxFreq,frequency[k]);
                        minFreq=Math.min(minFreq,frequency[k]);
                    }
                }
                totalBeauty+=(maxFreq - minFreq);
            }
        }
        return totalBeauty;
    }
}
