// Last updated: 8/14/2025, 11:23:04 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandy = candyType.length / 2;
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int i=0;i<candyType.length;i++) {
            uniqueCandies.add(candyType[i]); 
        }
        return Math.min(maxCandy, uniqueCandies.size()); 
    }
}
