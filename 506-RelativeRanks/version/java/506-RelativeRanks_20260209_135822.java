// Last updated: 2/9/2026, 1:58:22 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n=score.length;
4        Integer[] idx=new Integer[n];
5        for(int i=0;i<n;i++){
6            idx[i]=i;
7        }
8        Arrays.sort(idx,(a,b)->score[b]-score[a]);
9        String[] ans=new String[n];
10        for(int i=0;i<n;i++){
11            if(i==0){
12                ans[idx[i]]="Gold Medal";
13            }
14            else if(i==1){
15                ans[idx[i]]="Silver Medal";
16            }
17            else if(i==2){
18                ans[idx[i]]="Bronze Medal";
19            }else{
20                ans[idx[i]]=String.valueOf(i+1);
21            }
22        }
23        return ans;
24    }
25}