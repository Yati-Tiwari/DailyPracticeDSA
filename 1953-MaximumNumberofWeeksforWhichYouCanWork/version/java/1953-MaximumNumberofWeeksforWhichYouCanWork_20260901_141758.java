// Last updated: 9/1/2026, 2:17:58 PM
1class Solution {
2    public long numberOfWeeks(int[] milestones) {
3        long sum=0;
4        long max=0;
5        for(int i=0;i<milestones.length;i++){
6            sum+=milestones[i];
7            if(milestones[i]>max){
8                max=milestones[i];
9            }
10        }
11        long rest=sum-max;
12        if(max > rest+1){
13            long a=(rest*2+1);
14            return a;
15        } 
16        else{
17            return sum;
18        }
19    }
20}
21