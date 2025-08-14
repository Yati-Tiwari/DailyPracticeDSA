// Last updated: 8/14/2025, 11:19:09 AM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int N= nums.length;
        StringBuilder answer=new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(nums[i].charAt(i)=='0' ? '1' : '0');
        }
        return answer.toString();
    }
}
