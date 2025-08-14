// Last updated: 8/14/2025, 11:16:58 AM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < 2 * n; ++i) { 
            if (i > 0 && colors[i % n] == colors[(i - 1) % n]) {
                count = 1;
            } else {
                count++;
            }
            if (i >= n && count >= k) { 
                ans++;
            }
        }
        return ans;
    }
}
