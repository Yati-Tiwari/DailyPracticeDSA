// Last updated: 8/14/2025, 11:23:30 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int N=nums.length;
        int[] RESULT=new int[N];
        for (int i=0;i<N;i++) {
            int Next=-1;
            for (int j=1;j<N;j++) {
                int idx=(i+j) % N;
                if (nums[idx]> nums[i]) {
                    Next=nums[idx];
                    break;
                }
            }
            RESULT[i]=Next;
        }
        return RESULT;
    }
}
