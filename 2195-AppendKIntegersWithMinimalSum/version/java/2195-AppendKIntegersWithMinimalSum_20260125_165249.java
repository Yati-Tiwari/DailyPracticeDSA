// Last updated: 1/25/2026, 4:52:49 PM
1import java.util.*;
2class Solution {
3    public long minimalKSum(int[] nums, int k) {
4        Arrays.sort(nums);
5        int n=nums.length;
6        long sum=0;
7        long current=1;
8        int count=0;
9       for(int i=0;i<n;i++){
10        if(i>0 && nums[i]==nums[i-1]){
11            continue;
12        }
13        while(count<k && current<nums[i]){
14            sum+=current;
15            count++;
16            current++;
17        }
18        if(current==nums[i]){
19            current++;
20        }
21       }
22        while(count<k){
23            sum+=current;
24            count++;
25            current++;
26        }
27        return sum;
28    }
29}
30        