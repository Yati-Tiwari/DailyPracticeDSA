// Last updated: 8/14/2025, 11:23:13 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                count++;
                }
            }
        }
        return count;
    }
}