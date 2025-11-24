// Last updated: 11/24/2025, 8:29:21 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> Result=new ArrayList<>();
        int current=0;
        for (int i=0; i<nums.length;i++) {
            current = (current * 2 + nums[i]) % 5;
            Result.add(current==0);
        }
        return Result;
    }
}
