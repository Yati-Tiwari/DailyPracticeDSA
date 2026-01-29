// Last updated: 1/29/2026, 2:40:48 PM
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        int c=0;
4      HashMap<Integer,Integer> map=new HashMap<>();
5       for(int i=0;i<nums.length;i++){
6        for(int j=i+1;j<nums.length;j++){
7          if (map.containsKey(nums[i]*nums[j])) {
8            map.put(nums[i]*nums[j], map.get(nums[i]*nums[j]) + 1);
9        } else {
10            map.put(nums[i]*nums[j], 1);
11        }
12        }
13       } 
14       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
15            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
16            int n=entry.getValue();
17            c+= 8*n * (n - 1) / 2;
18        }
19        return c;
20    }
21    
22}