// Last updated: 2/8/2026, 8:57:47 AM
1class Solution {
2    public int dominantIndices(int[] nums) {
3       int lgth=nums.length;
4        if(lgth<=1){
5            return 0;
6        }
7        ArrayList<Long> mithu=new ArrayList<>();
8        ArrayList<Long> ticku=new ArrayList<>();
9        long shyam=0;
10        long gino=0;
11        for(int i=lgth-1;i>=0;i--){
12            shyam+=nums[i];
13            gino++;
14
15            mithu.add(shyam);
16            ticku.add(gino);
17        }
18        int gyan=0;
19        for(int i=0;i<lgth-1;i++){
20            long fox=mithu.get(lgth-i-2);
21            long xof=ticku.get(lgth-i-2);
22            if((long) nums[i]*xof>fox){
23                gyan++;
24            }
25        }
26        return gyan;
27        
28    }
29}