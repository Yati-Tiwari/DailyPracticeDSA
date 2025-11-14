// Last updated: 11/14/2025, 10:15:11 PM
class Solution {
    public int maxSum(int[] nums){
        int ans=-1;
        int[] maxNum=new int[10];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int temp=num;
            int maxDigit=0;
            while(temp>0){
                maxDigit=Math.max(maxDigit,temp%10);
                temp/=10;
            }
            if(maxNum[maxDigit]>0) {
                ans=Math.max(ans,num+maxNum[maxDigit]);
            }
            maxNum[maxDigit]=Math.max(maxNum[maxDigit],num);
        }
        return ans;
    }
}
