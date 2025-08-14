// Last updated: 8/14/2025, 11:18:53 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive=0;
        int Negative=1;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[positive]=nums[i];
                positive+=2;
            }
            else{
                result[Negative]=nums[i];
                Negative+=2;
            }
        }
        return result;
    }
}