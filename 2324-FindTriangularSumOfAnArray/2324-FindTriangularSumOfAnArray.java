// Last updated: 8/14/2025, 11:18:42 AM
class Solution {
    public int triangularSum(int[] nums) {
        while (nums.length>1) {
            int[] NEXT=new int[nums.length-1];
            for (int i=0;i< nums.length -1;i++) {
                NEXT[i]=(nums[i]+nums[i+1]) % 10;
            }
            nums=NEXT;
        }
        return nums[0];
    }
}