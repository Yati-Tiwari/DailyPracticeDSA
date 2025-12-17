// Last updated: 12/17/2025, 9:41:03 PM
1import java.util.*;
2
3class Solution {
4    public boolean canReorderDoubled(int[] arr) {
5
6        Map<Integer, Integer> freq = new HashMap<>();
7        for (int i = 0; i < arr.length; i++) {
8            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
9        }
10
11        Integer[] nums = new Integer[arr.length];
12        for (int i = 0; i < arr.length; i++) {
13            nums[i] = arr[i];
14        }
15
16        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
17
18        for (int i = 0; i < nums.length; i++) {
19            int x = nums[i];
20
21            if (freq.get(x) == 0) {
22                continue;
23            }
24
25            if (freq.getOrDefault(2 * x, 0) == 0) {
26                return false;
27            }
28
29            freq.put(x, freq.get(x) - 1);
30            freq.put(2 * x, freq.get(2 * x) - 1);
31        }
32
33        return true;
34    }
35}
36