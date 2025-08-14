// Last updated: 8/14/2025, 11:24:43 AM
class NumArray {
    public int[] nums;

    public NumArray(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int Sum=0;
        for(int i=left;i<=right;i++){
            Sum+=nums[i];
        }
        return Sum;
    }
    
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */