// Last updated: 10/26/2025, 9:01:45 PM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;
        long occupied = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            Long left=(long)nums[i]-k;
            Long right=(long)nums[i]+k;
            if(occupied < right){
                occupied=Math.max(occupied+1,left);
                count++;
            }

        }
        return count;
    }
}