// Last updated: 8/14/2025, 11:21:09 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int idx=n-1;
        int[] ans=new int[n];
        while(left<=right){
            int left_square=nums[left]*nums[left];
            int right_square=nums[right]*nums[right];
            if(left_square > right_square){
                ans[idx--]=left_square;
                left++;
            }
            else{
                ans[idx--]=right_square;
                right--;
            }
                        
        }
        return ans;
    }
}