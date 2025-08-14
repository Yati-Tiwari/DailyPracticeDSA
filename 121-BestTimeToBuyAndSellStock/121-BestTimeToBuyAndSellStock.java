// Last updated: 8/14/2025, 11:26:03 AM
public class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int p=prices[0];
       for(int i=1;i<prices.length;i++){
        if(p>prices[i]){
            p=prices[i];
        }
        maxprofit=Math.max(maxprofit,prices[i]-p);
       }
        return maxprofit;
    }
}
