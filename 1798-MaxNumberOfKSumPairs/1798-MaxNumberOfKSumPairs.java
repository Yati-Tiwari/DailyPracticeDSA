// Last updated: 8/14/2025, 11:19:38 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;

    }
}