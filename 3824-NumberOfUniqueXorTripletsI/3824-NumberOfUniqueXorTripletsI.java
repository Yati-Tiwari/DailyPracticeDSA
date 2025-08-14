// Last updated: 8/14/2025, 11:16:31 AM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3){
            return n;
        }
        int result=(int)(Math.log(n)/Math.log(2));
        return 1<<(result+1);
    }
}