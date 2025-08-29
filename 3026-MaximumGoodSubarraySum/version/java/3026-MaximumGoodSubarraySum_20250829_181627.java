// Last updated: 8/29/2025, 6:16:27 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int Res=0;
        int[] count=new int[60];
        for(int i=0;i<time.length;i++){
            int r1=time[i]%60;
            int r2=(60-r1) % 60;
            Res+=count[r2];
            count[r1]++;
        }
        return Res;

    }
}