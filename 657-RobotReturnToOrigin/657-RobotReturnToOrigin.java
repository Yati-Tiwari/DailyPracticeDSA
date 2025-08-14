// Last updated: 8/14/2025, 11:22:43 AM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            int Move=moves.charAt(i);
            if(Move=='U'){
                y++;
            }
             else if(Move=='D'){    
                y--;           
            }
             else if(Move=='L'){    
                x--;          
            }
             else if(Move=='R'){
                x++;                
            }
        }
        return x==0 && y==0;
    }
}