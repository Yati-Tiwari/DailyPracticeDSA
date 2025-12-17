// Last updated: 12/17/2025, 9:42:46 PM
1class Solution {
2    public boolean canReorderDoubled(int[] arr) {
3        Map<Integer, Integer> freq=new HashMap<>();
4        for (int i=0; i < arr.length;i++) {
5            freq.put(arr[i],freq.getOrDefault(arr[i],0) + 1);
6        }
7        Integer[] nums=new Integer[arr.length];
8        for (int i=0; i < arr.length; i++) {
9            nums[i]=arr[i];
10        }
11        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
12        for (int i=0; i < nums.length; i++) {
13            int x=nums[i];
14            if (freq.get(x)==0) {
15                continue;
16            }
17            if (freq.getOrDefault(2 * x,0)==0) {
18                return false;
19            }
20            freq.put(x, freq.get(x) -1);
21            freq.put(2 * x,freq.get(2 * x)-1);
22        }
23        return true;
24    }
25}
26