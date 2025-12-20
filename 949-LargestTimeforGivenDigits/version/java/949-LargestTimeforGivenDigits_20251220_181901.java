// Last updated: 12/20/2025, 6:19:01 PM
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        String ans="";
4        for (int i=0;i<4;i++) {
5            for (int j=0;j<4;j++) {
6                if (j==i){
7                    continue;
8                }
9                for (int k=0;k<4;k++) {
10                    if (k==i || k==j){
11                        continue;
12                    }
13                    int l=6-i-j-k;
14                    int hour=arr[i] * 10+arr[j];
15                    int mini=arr[k] * 10+arr[l];
16                    if (hour<24 && mini<60) {
17                        String h="";
18                        String m="";
19                        if (hour < 10){
20                            h="0"+hour;
21                        }
22                        else{
23                            h="" + hour;
24                        }
25                        if (mini< 10){
26                            m="0" +mini;
27                        }
28                        else{
29                            m="" +mini;
30                        }
31                        String Time=h + ":" + m;
32                        if (Time.compareTo(ans) > 0) {
33                            ans=Time;
34                        }
35                    }
36                }
37            }
38        }
39        return ans;
40    }
41}
42