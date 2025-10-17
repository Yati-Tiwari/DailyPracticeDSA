// Last updated: 10/17/2025, 12:39:12 PM
class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return gcd(min,max);
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd( b % a,a);
    }
}