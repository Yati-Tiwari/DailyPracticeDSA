// Last updated: 8/14/2025, 11:18:23 AM
class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] ANS=new int[nums.length - 1];
        int X=0;
        for (int i=0; i < nums.length-1; i++) {
            int Sum = nums[i] + nums[i+1];
            for (int j=0; j<X; j++) {
                if (ANS[j] == Sum) {
                    return true;
                }
            }
            ANS[X++] = Sum;
        }
        return false;
    }
}
