// Last updated: 8/14/2025, 11:18:12 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0;
        int xor2=0;
        for (int i=0; i < nums1.length; i++) {
            xor1 ^= nums1[i];
        }
        for (int i=0; i < nums2.length; i++) {
            xor2 ^= nums2[i];
        }
        int ans=0;
        if (nums2.length % 2 == 1) {
            ans ^= xor1;
        }
        if (nums1.length % 2 == 1) {
            ans^= xor2;
        }
        return ans;
    }
}
