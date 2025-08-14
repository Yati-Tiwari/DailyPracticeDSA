// Last updated: 8/14/2025, 11:20:48 AM
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}