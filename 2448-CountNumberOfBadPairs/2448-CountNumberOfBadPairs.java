// Last updated: 8/14/2025, 11:18:33 AM

class Solution {
    public long countBadPairs(int[] nums) {
        long badPairs = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int key = i - nums[i];
            badPairs += i - countMap.getOrDefault(key, 0);
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }
        return badPairs;
    }
}
