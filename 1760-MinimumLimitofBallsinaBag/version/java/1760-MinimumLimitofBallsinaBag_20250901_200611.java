// Last updated: 9/1/2025, 8:06:11 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0;
        int b=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                a++;
               
            }else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                b++;
                
            }
        }
        return a>b;
    }
}