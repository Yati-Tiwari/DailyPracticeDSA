// Last updated: 9/27/2025, 7:36:37 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[] RESULT= new int[nums.length - k + 1];
        int l=0;
        int r=0;
        int i=0;
        while (r < nums.length) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
                q.pollLast();
            }
            q.addLast(r);
            if (q.peekFirst() < l) {
                q.pollFirst();
            }
            if (r - l + 1 >= k) {
                RESULT[i++] = nums[q.peekFirst()];
                l++; 
            }
            r++;
        }
        return RESULT;
    }
}