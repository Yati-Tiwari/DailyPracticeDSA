// Last updated: 11/30/2025, 10:32:08 PM
1class Solution{
2    public int minSubarray(int[] nums,int p){
3        long s=0;
4        for(int i=0;i<nums.length;i++){
5            s+=nums[i];
6        }
7        int r=(int)(s%p);
8        if(r==0){
9            return 0;
10        }
11        Map<Integer,Integer> map=new HashMap<>();
12        map.put(0,-1);
13        long pre=0;
14        int ans=nums.length;
15        for(int i=0;i<nums.length;i++){
16            pre=(pre+nums[i])%p;
17            int need=(int)((pre-r+p)%p);
18            if(map.containsKey(need)){
19                ans=Math.min(ans,i-map.get(need));
20            }
21            map.put((int)pre,i);
22        }
23        if(ans==nums.length){
24            return -1;
25        }else{
26            return ans;
27        }
28    }
29}
30