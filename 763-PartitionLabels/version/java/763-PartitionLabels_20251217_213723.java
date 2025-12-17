// Last updated: 12/17/2025, 9:37:23 PM
1class Solution {
2    public List<Integer> partitionLabels(String s) {
3        int[] last=new int[26];
4        for (int i=0;i < s.length();i++) {
5            last[s.charAt(i)-'a']=i;
6        }
7        List<Integer> result=new ArrayList<>();
8        int start=0,end=0;
9        for (int i=0; i<s.length(); i++) {
10            end=Math.max(end,last[s.charAt(i)-'a']);
11            if (i==end) {
12                result.add(end-start +1);
13                start=i+1;
14            }
15        }
16        return result;
17    }
18}
19