// Last updated: 8/14/2025, 11:22:26 AM
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int p1=0;
        int ans=0;
        while (p1 < nums1.length) {
            int p2=0;
            while (p2 < nums2.length
                ) {
                int c=0;
                int i=p1;
                int j=p2;
                while (i<nums1.length && j<nums2.length && nums1[i]==nums2[j]) {
                    c++;
                    i++;
                    j++;
                }
                ans=Math.max(c,ans);
                p2++;
            }
            p1++;
        }
        return ans;
    }
}