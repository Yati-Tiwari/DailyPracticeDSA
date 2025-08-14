// Last updated: 8/14/2025, 11:26:31 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> Result = new ArrayList<>();
        Result.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++) {
            int size = Result.size();
            for (int j=0;j<size;j++) {
                List<Integer> newSubset = new ArrayList<>(Result.get(j));
                newSubset.add(nums[i]);
                Result.add(newSubset);
            }
        }
        return Result;
    }
}
