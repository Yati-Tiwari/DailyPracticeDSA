// Last updated: 8/30/2025, 9:15:47 PM
class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
         if(tomatoSlices%2!=0) {
            return new ArrayList<>();
         }
        int small_Burger = (4 * cheeseSlices - tomatoSlices) / 2;
        int jumbo_Burger = cheeseSlices - small_Burger;
        if (small_Burger < 0 || jumbo_Burger < 0 || 
            (4 * jumbo_Burger + 2 * small_Burger) != tomatoSlices) {
            return new ArrayList<>();
        }
        List<Integer> ans= new ArrayList<>();
        ans.add(jumbo_Burger);
        ans.add(small_Burger);
        return ans;
    }
}