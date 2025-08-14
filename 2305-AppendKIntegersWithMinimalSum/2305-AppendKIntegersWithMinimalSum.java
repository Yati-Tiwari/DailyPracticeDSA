// Last updated: 8/14/2025, 11:18:49 AM
import java.util.*;
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        long current=1;
        int count=0;
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        while(count<k && current<nums[i]){
            sum+=current;
            count++;
            current++;
        }
        if(current==nums[i]){
            current++;
        }
       }
        while(count<k){
            sum+=current;
            count++;
            current++;
        }
        return sum;
    }
}
        