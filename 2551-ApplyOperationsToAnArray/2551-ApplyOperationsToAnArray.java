// Last updated: 8/14/2025, 11:18:09 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        int N=nums.length;
        for (int i=0; i < N-1; i++) {
            if (nums[i]==nums[i + 1]) {
                nums[i]=nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        int[] Answer=new int[N];
        int idx=0;
        for (int i=0; i < N; i++) {
            if (nums[i] != 0) {
                Answer[idx]=nums[i];
                idx++;
            }
        }
        return Answer;
    }
}
