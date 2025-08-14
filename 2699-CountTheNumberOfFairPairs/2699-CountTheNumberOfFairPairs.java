// Last updated: 8/14/2025, 11:17:53 AM
class Solution {
    public long countFairPairs(int[] nums,int lower,int upper) {
        Arrays.sort(nums);
        return Count_Pairs(nums,upper)-Count_Pairs(nums,lower - 1);
    }
    public static long Count_Pairs(int[] nums,int target) {
        long count=0;
        int Left=0;
        int Right=nums.length-1;
        while (Left<Right) {
            if (nums[Left]+nums[Right] <= target) {
                count+=(Right-Left);
                Left++;
            } else {
                Right--;
            }
        }
        return count;
    }
}
