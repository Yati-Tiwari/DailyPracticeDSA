// Last updated: 11/18/2025, 9:04:19 PM
import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int Prev=0;
        int current=0;
        int Max=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            current++;
            if(i==n-1  || nums.get(i)>=nums.get(i+1)){
                Max=Math.max(Max,current/2);
                Max=Math.max(Max,Math.min(Prev,current));
                Prev=current;
                current=0;
            }
            if(Max>=k) {
                return true;
            }
        }
        return Max >= k;
    }
}
