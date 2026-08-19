// Last updated: 8/19/2026, 8:33:57 PM
1import java.util.*;
2class Solution {
3    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int cap) {
4        int n1=buses.length;
5        int n2=passengers.length;
6        int j=0;
7        int ans=0;
8        HashSet<Integer> set=new HashSet<>();
9        Arrays.sort(buses);
10        Arrays.sort(passengers);
11        for(int i=0;i<n1;i++){
12            int c=0;
13            while(c < cap && j < n2 && passengers[j]<=buses[i]){
14                if(!set.contains(passengers[j]-1)){
15                    ans=passengers[j]-1;
16                }
17                set.add(passengers[j]);
18                c++;
19                j++;
20            }
21            if(c <cap && !set.contains(buses[i])){
22                ans=buses[i];
23            }
24        }
25        return ans;
26    }
27}