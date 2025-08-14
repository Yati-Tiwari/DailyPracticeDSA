// Last updated: 8/14/2025, 11:23:08 AM
class Solution {
    public int arrayNesting(int[] nums) {
        int maxSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) { 
                int size = 0;
                int current = i;
                while (nums[current] != -1) { 
                    int next = nums[current];
                    nums[current] = -1; 
                    current = next;
                    size++;
                }
                maxSize = Math.max(maxSize, size); 
            }
        }

        return maxSize;
    }
}
