// Last updated: 9/16/2025, 12:47:08 PM
class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum=0;
        long max=0;
        for(int i=0;i<milestones.length;i++){
            sum+=milestones[i];
            if(milestones[i]>max){
                max=milestones[i];
            }
        }
        long rest = sum - max;
        if (max > rest + 1) {
            long a=(rest * 2 + 1);
            return a;
        } else {
            return sum;
        }
    }
}
