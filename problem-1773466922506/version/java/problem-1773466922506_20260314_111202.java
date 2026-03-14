// Last updated: 3/14/2026, 11:12:02 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        List<String> li=new ArrayList<>();
4        backtrack(n, "", li);
5        if(k <= li.size()){
6            return li.get(k - 1);
7        } else{
8            return "";
9        }
10    }
11
12    private void backtrack(int n, String curr, List<String> li) {
13        if(curr.length()==n) {
14            li.add(curr);
15            return;
16        }
17        char[] chars={'a', 'b', 'c'};
18        for(int i=0; i < chars.length; i++){
19            char c=chars[i];
20            if(curr.length()==0 || curr.charAt(curr.length()-1) !=c){
21                backtrack(n, curr + c, li);
22            }
23        }
24    }
25}