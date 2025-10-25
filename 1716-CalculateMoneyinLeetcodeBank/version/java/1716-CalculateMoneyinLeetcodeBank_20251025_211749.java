// Last updated: 10/25/2025, 9:17:49 PM
class Solution {
    public int totalMoney(int n) {
        int total=0;
        int dayofweek=0;
        int start_week=1;
        for(int i=1;i<=n;i++){
            total+=(dayofweek+start_week);
            dayofweek++;
            if(dayofweek==7){
                dayofweek=0;
                start_week++;
            }
            
        }
        return total;
    }
}