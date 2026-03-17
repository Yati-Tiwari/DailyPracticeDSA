// Last updated: 3/17/2026, 11:35:43 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums1.length;i++){
5            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
6        }
7        List<Integer> li=new ArrayList<>();
8        for(int i=0;i<nums2.length;i++){
9            if(map.getOrDefault(nums2[i],0)>0){
10                li.add(nums2[i]);
11                map.put(nums2[i],map.get(nums2[i])-1);
12            }
13        }
14        int[] result=new int[li.size()];
15        for(int i=0;i<li.size();i++){
16            result[i]=li.get(i);
17        }
18        return result;
19        
20    }
21}