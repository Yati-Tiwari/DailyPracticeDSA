// Last updated: 10/15/2025, 8:36:58 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        k=k-1;
        while(k>=0){
            int maxf=0;
            int element=-1;
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    int f=map.get(nums[i]);
                    if(f>maxf){
                        maxf=f;
                        element=nums[i];
                    }
                }
            }
            ans[k]=element;
            map.remove(element);
            k--;
        }
        return ans;
    }
}