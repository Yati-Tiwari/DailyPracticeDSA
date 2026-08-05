// Last updated: 8/5/2026, 8:14:22 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3    //   int[] ans=new int[2];
4    //     for(int i=0;i<nums.length;i++){
5    //         for(int j=i+1;j<nums.length;j++){
6    //             if(nums[i]+nums[j]==target){
7    //                 ans[0]=i;
8    //                 ans[1]=j;
9    //                 return ans;
10    //             }
11    //         }
12    //     }
13    //     return new int[0];
14    // }
15        HashMap<Integer,Integer> map=new HashMap<>();
16        for(int i=0;i<nums.length;i++){
17            int val=target-nums[i];
18            if(!map.containsKey(val)){
19                map.put(nums[i],i);
20            }else{
21                return new int[]{map.get(val),i};
22            }
23        }
24        return new int[]{};
25    }
26}