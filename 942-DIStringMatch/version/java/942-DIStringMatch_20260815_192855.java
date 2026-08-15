// Last updated: 8/15/2026, 7:28:55 PM
1class Solution {
2    public int[] diStringMatch(String s) {
3        int[] answer=new int[s.length()+1];
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='I'){
7                answer[i]=c;
8                c++;
9            }
10        }
11        answer[s.length()]=c++;
12        for(int i=s.length()-1;i>=0;i--){
13            if(s.charAt(i)=='D'){
14                answer[i]=c++;
15            }
16        }
17        return answer;
18    }
19}