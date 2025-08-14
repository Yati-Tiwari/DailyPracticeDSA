// Last updated: 8/14/2025, 11:17:15 AM
public class Solution {
    public int minOperations(int k) {
        int MinOperations=k-1; 
          for (int x=1;x<= k;x++) {
            int y=(k+x-1)/x-1; 
            MinOperations=Math.min(MinOperations,(x-1)+y);
        }
        return MinOperations;
    }
}
