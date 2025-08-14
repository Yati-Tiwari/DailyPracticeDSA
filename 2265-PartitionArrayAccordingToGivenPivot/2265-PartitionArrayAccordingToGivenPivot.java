// Last updated: 8/14/2025, 11:18:54 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] < pivot) {  
                result[index++] = nums[i];
            } else if (nums[i] == pivot) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            result[index++] = pivot;
        }
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] > pivot) { 
                result[index++] = nums[i];
            }
        }      
        return result;
    }
}
