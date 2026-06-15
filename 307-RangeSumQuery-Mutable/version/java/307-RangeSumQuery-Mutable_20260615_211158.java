// Last updated: 6/15/2026, 9:11:58 PM
1class NumArray {
2    int[] Tree;
3    int n;
4    public NumArray(int[] nums) {
5        n = nums.length;
6        Tree = new int[2 * n];
7        for (int i = 0; i < n; i++) {
8            Tree[n + i] = nums[i];
9        }
10        for (int i = n - 1; i > 0; i--) {
11            Tree[i] = Tree[2 * i] + Tree[2 * i + 1];
12        }
13    }
14    public void update(int idx, int val) {
15        idx=idx+n;
16        Tree[idx] = val;
17        while (idx > 1) {
18            idx=idx/2;
19            Tree[idx] = Tree[2 * idx] + Tree[2 * idx + 1];
20        }
21    }
22    public int sumRange(int left, int right) {
23        left += n;
24        right += n;
25        int Sum = 0;
26        while (left <= right) {
27            if ((left % 2) == 1) {
28                Sum += Tree[left];
29                left++;
30            }
31            if ((right % 2) == 0) {
32                Sum += Tree[right];
33                right--;
34            }
35            left /= 2;
36            right /= 2;
37        }
38        return Sum;
39    }
40}
41