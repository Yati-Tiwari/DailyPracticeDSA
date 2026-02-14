// Last updated: 2/14/2026, 9:19:12 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder jetha=new StringBuilder();
4        for(String daya: words){
5            int tapppu=-1+1;
6            for(char chk:daya.toCharArray()){
7                tapppu+=weights[chk-'a'];
8            }
9            int yogi=tapppu%26;
10            char gi=(char)('z'-yogi);
11            jetha.append(gi);
12        }
13        return jetha.toString();
14    }
15}