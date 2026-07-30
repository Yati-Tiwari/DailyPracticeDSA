// Last updated: 7/30/2026, 12:32:23 PM
1class Solution {
2    public int compress(char[] chars) {
3        int Index=0;
4        int i=0;     
5        while(i<chars.length) {
6            char Current_Char=chars[i];
7            int Count=0;           
8            while(i<chars.length && chars[i]==Current_Char){
9                i++;
10                Count++;
11            }          
12            chars[Index++]=Current_Char;           
13            if(Count > 1) {
14                String Count_String=Integer.toString(Count);
15                for(int j=0;j<Count_String.length();j++){
16                    chars[Index++]=Count_String.charAt(j);
17                }
18            }
19        }      
20        return Index;
21    }
22}
23