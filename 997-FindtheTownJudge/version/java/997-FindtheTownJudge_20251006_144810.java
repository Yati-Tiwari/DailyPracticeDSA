// Last updated: 10/6/2025, 2:48:10 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // flowers placed
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            // check if current plot is empty AND neighbors are empty or boundary
            if (flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==length-1 || flowerbed[i+1]==0)) {
                flowerbed[i] = 1; // place flower
                count++;           // increase placed flowers
                if (count >= n) {  // early exit if enough flowers
                    return true; 
                }
            }
        }
        return count >= n; // return if enough flowers could be placed
    }
}
