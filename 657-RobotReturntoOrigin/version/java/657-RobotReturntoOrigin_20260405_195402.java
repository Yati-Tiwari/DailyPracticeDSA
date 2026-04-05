// Last updated: 4/5/2026, 7:54:02 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x=0;
4        int y=0;
5        for(int i=0;i<moves.length();i++){
6            int Move=moves.charAt(i);
7            if(Move=='U'){
8                y++;
9            }
10             else if(Move=='D'){    
11                y--;           
12            }
13             else if(Move=='L'){    
14                x--;          
15            }
16             else if(Move=='R'){
17                x++;                
18            }
19        }
20        return x==0 && y==0;
21    }
22}