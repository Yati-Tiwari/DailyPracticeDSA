// Last updated: 8/14/2025, 11:23:34 AM
class Solution {
    public int[] constructRectangle(int area) {
        int w=(int) Math.sqrt(area);
        while(area % w !=0){
            w--;
        }
        int l=area/w;
        int[] ans= new int[2];
        ans[0]=l;
        ans[1]=w;
        return ans;
    }
}