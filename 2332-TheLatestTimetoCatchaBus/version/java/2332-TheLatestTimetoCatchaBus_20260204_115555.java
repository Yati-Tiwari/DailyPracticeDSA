// Last updated: 2/4/2026, 11:55:55 AM
1import java.util.*;
2class Solution {
3    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int cap) {
4        int n1=buses.length, n2=passengers.length;
5        int j=0;
6        int ans=0;
7        HashSet<Integer> set=new HashSet<>();
8        Arrays.sort(buses);
9        Arrays.sort(passengers);
10        for (int i=0; i<n1; i++) {
11            int c=0;
12            while (c < cap && j < n2 && passengers[j]<=buses[i]) {
13                if (!set.contains(passengers[j]-1)) {
14                    ans=passengers[j]-1;
15                }
16                set.add(passengers[j]);
17                c++;
18                j++;
19            }
20            if (c <cap && !set.contains(buses[i])) {
21                ans=buses[i];
22            }
23        }
24        return ans;
25    }
26}