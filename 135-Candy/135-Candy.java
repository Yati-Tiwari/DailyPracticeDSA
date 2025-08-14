// Last updated: 8/14/2025, 11:25:53 AM
public class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] CANDIES=new int[n];
        for (int i=0; i < n; i++) {
            CANDIES[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                CANDIES[i] = CANDIES[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                CANDIES[i] = Math.max(CANDIES[i], CANDIES[i + 1] + 1);
            }
        }
        int TOTALCandies = 0;
        for (int candy : CANDIES) {
            TOTALCandies+=candy;
        }
        return TOTALCandies;
    }
}
