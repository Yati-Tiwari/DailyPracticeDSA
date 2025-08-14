// Last updated: 8/14/2025, 11:23:48 AM
public class Solution {
    public String frequencySort(String s) {
        int[] frequency=new int[128];
        for (int i=0;i<s.length();i++) {
            frequency[s.charAt(i)]++;
        }
        String result= "";
        int remaining=s.length();
        while (remaining>0) {
            int maxFreq=0;
            char maxChar=0;
            for (int i =0; i<128;i++) {
                if (frequency[i] > maxFreq) {
                    maxFreq=frequency[i];
                    maxChar=(char) i;
                }
            }
            if (maxFreq == 0)
            {
                 break;
            }
            for (int i=0;i< maxFreq;i++) {
                result +=maxChar;
            }
            remaining=remaining-maxFreq;
            frequency[maxChar] = 0;
        }
        return result;
    }
}
