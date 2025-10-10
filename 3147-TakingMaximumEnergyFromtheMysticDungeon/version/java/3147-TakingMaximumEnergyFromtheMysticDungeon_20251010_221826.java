// Last updated: 10/10/2025, 10:18:26 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int ans=Integer.MIN_VALUE;
        int[] suffix=new int[n];
        for(int i=n-1;i>=0;i--){
            if(i+k < n){
                suffix[i]=energy[i]+suffix[i+k];
            }
            else{
                suffix[i]=energy[i];
            }
            ans= Math.max(ans,suffix[i]);
        }
        return ans;
    }
}