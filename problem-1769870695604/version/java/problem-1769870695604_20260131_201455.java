// Last updated: 1/31/2026, 8:14:55 PM
1class Solution {
2    public String reverseByType(String s) {
3        Stack<Character> ltrSt=new Stack<>();
4        Stack<Character> spclSt=new Stack<>();
5        for(int i=0;i<s.length();i++){
6            char kiku=s.charAt(i);
7            if(kiku>='a' && kiku<='z'){
8                ltrSt.push(kiku);
9            }else{
10                spclSt.push(kiku);
11            }
12        }
13        StringBuilder ansr=new StringBuilder();
14        for(int i=0;i<s.length();i++){
15            char kiku=s.charAt(i);
16            if(kiku>='a' && kiku<='z'){
17                ansr.append(ltrSt.pop());
18            }else{
19                ansr.append(spclSt.pop());
20            }
21        }
22        return ansr.toString();
23    }
24}