// Last updated: 8/14/2025, 11:18:26 AM
class Solution {
    public int maximumSum(int[] nums) {
        int[] maxsum=new int[100];
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int num=nums[i];
            int temp=num;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            if(maxsum[sum]>0){
                ans=Math.max(ans,num+maxsum[sum]);
            }
            maxsum[sum]=Math.max(maxsum[sum],num);
                  
        }
        return ans;
    }
}