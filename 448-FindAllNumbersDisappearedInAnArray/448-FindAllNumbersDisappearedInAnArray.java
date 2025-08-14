// Last updated: 8/14/2025, 11:23:50 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx]>0) {
                nums[idx] = -nums[idx];
            }
        }
        List<Integer> Answer=new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                Answer.add(i+1);
            }
        }
        return Answer;
    }
}
