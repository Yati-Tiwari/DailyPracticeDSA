// Last updated: 8/14/2025, 11:22:13 AM
class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target); 
        int Sum=0;
        int Steps=0;
        while (Sum < target || (Sum-target) % 2 != 0) {
            Steps++;
            Sum += Steps;
        }
        return Steps;
    }
}
