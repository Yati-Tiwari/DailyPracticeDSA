// Last updated: 10/10/2025, 10:31:46 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=n-1-k ;i>=0;i--){ // add future energies
            energy[i]+=energy[i+k];
        }
        for(int i=0;i<n;i++){
            if(energy[i] > ans){
                ans=energy[i];
            }
        }
        return ans;
    }
}