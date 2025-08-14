// Last updated: 8/14/2025, 11:18:31 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int Min_Recolors=Integer.MAX_VALUE;
        for (int i=0; i<= blocks.length()-k;i++) {
            int White_Count=0;
            for (int j=i;j<i+k; j++) {
                if (blocks.charAt(j)=='W') {
                    White_Count++;
                }
            }
            Min_Recolors=Math.min(Min_Recolors,White_Count);
        }
        return Min_Recolors;
    }
}