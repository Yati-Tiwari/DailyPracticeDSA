// Last updated: 9/30/2025, 10:20:36 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26]; // freq store karne ka array (sirf A-Z)
        int left=0;              // window ka start
        int max_Count=0;          // window mei jo char max baar aaya uska freq
        int result=0;            // ans store karne ka
        for (int right=0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++; // is char ka freq badha do

            max_Count = Math.max(max_Count, count[c - 'A']); // max freq update karo
            // agar window size - maxCount > k hua matlab jyada changes chahiye
            // to left ko move karna padega (window chhoti karo)

            while ((right - left + 1) - max_Count > k) {
                count[s.charAt(left) - 'A']--; // left wale char ka freq kam karo
                left++; // window shrink karo
            }
            // abhi tak ka max window size nikal lo
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
