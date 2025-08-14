// Last updated: 8/14/2025, 11:20:20 AM
class Solution {
    public int tupleSameProduct(int[] nums) {
        int c=0;
      HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
          if (map.containsKey(nums[i]*nums[j])) {
            map.put(nums[i]*nums[j], map.get(nums[i]*nums[j]) + 1);
        } else {
            map.put(nums[i]*nums[j], 1);
        }
        }
       } 
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            int n=entry.getValue();
            c+= 8*n * (n - 1) / 2;
        }
        return c;
    }
    
}