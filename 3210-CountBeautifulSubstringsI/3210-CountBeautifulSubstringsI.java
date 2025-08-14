// Last updated: 8/14/2025, 11:17:27 AM
public class Solution {
    public int beautifulSubstrings(String s, int k) {
        int Count =0;
        int n=s.length();
        for (int i=0;i< n;i++) {
            int Vowels = 0;
            int Consonants=0;
            for (int j=i;j <n;j++) {
                char ch=s.charAt(j);
                if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    Vowels++;
                } else {
                    Consonants++;
                }
                if (Vowels==Consonants && (Vowels*Consonants) % k==0) {
                    Count++;
                }
            }
        }
        return Count;
    }
}
