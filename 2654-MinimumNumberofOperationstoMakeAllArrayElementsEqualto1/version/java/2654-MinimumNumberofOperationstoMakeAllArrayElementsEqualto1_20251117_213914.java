// Last updated: 11/17/2025, 9:39:14 PM
class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ones=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==1) {
                ones++;
            }
        }
        if (ones > 0) {
            return n-ones;
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int g = nums[i];
            for (int j=i+1; j<n; j++) {
                int a=g, b=nums[j];
                while (b != 0) {
                    int temp = a % b;
                    a=b;
                    b = temp;
                }
                g=a;
                if (g==1) {
                    ans = Math.min(ans,j-i);
                    break;
                }
            }
        }
        if (ans==Integer.MAX_VALUE) {
            return -1;
        }
        int result=ans + n - 1;
        return result;
    }
}
