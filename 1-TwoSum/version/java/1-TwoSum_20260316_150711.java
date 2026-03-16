// Last updated: 3/16/2026, 3:07:11 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<numbers.length;i++){
5            int t=target-numbers[i];
6            if(!map.containsKey(t)){
7                map.put(numbers[i],i+1);
8            }else{
9                return new int[]{map.get(t),i+1};
10            }
11        }
12        return new int[]{};
13    }
14}