// Last updated: 9/16/2025, 12:24:03 PM
class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ans=0;
        int previous=0;
        for(int i=0;i<rungs.length;i++){
            int a=(rungs[i]-previous-1)/dist;
            ans=ans+a;
            previous=rungs[i];
        }
        return ans;
    }
}