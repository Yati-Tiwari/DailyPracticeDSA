// Last updated: 1/23/2026, 12:50:53 PM
1class Solution {
2    public long calculateScore(String s) {
3        Stack<Integer>[] st=new Stack[26];
4         //this is array of type stack 
5        // int[] arr=new int[n];
6        for (int i = 0; i < 26; i++) {
7            st[i] = new Stack<>();
8        }
9        long ans=0;
10        for(int i=0;i<s.length();i++){
11            char ch=s.charAt(i);
12            if(st['z'-ch].isEmpty()){
13                st[ch-'a'].push(i);
14            }else{
15                int x=st['z'-ch].pop();
16                ans+= i-x;
17            }
18            
19        }
20        return ans;
21
22    }
23}