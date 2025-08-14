// Last updated: 8/14/2025, 11:25:06 AM
import java.util.List;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> Ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return Ans;
        }
        int start_num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start_num == nums[i - 1]) {
                    Ans.add(String.valueOf(start_num));
                } else {
                    Ans.add(start_num + "->" + nums[i - 1]);
                }
                start_num = nums[i];
            }
        }
        if (start_num == nums[nums.length - 1]) {
            Ans.add(String.valueOf(start_num));
        } else {
            Ans.add(start_num + "->" + nums[nums.length - 1]);
        }
        return Ans;
    }
}
