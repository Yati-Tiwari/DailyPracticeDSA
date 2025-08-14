// Last updated: 8/14/2025, 11:24:42 AM
class NumArray {
    int[] Tree;
    int n;
    public NumArray(int[] nums) {
        n = nums.length;
        Tree = new int[2 * n];
        for (int i = 0; i < n; i++) {
            Tree[n + i] = nums[i];
        }
        for (int i = n - 1; i > 0; i--) {
            Tree[i] = Tree[2 * i] + Tree[2 * i + 1];
        }
    }
    public void update(int idx, int val) {
        idx=idx+n;
        Tree[idx] = val;
        while (idx > 1) {
            idx=idx/2;
            Tree[idx] = Tree[2 * idx] + Tree[2 * idx + 1];
        }
    }
    public int sumRange(int left, int right) {
        left += n;
        right += n;
        int Sum = 0;
        while (left <= right) {
            if ((left % 2) == 1) {
                Sum += Tree[left];
                left++;
            }
            if ((right % 2) == 0) {
                Sum += Tree[right];
                right--;
            }
            left /= 2;
            right /= 2;
        }
        return Sum;
    }
}
