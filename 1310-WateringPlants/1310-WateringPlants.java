// Last updated: 8/14/2025, 11:20:27 AM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int Steps=0;
        int current_Water=capacity;
        for (int i=0; i < plants.length; i++) {
            if (plants[i] <= current_Water) {
                Steps +=1;
                current_Water=current_Water-plants[i];
            } else {
                Steps += 2 * i+1;
                current_Water=capacity-plants[i];
            }
        }
        return Steps;
    }
}
