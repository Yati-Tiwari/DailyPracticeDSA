// Last updated: 8/14/2025, 11:23:15 AM
public class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        if (n==1) {
            return nums[0]+"";
        }
        if (n==2) {
            return nums[0]+"/" +nums[1];
        }

        String result=nums[0] + "/("+nums[1];

        for (int i=2;i<n;i++) {
            result+="/"+nums[i];
        }
        result+=")";
        return result;
    }
}
