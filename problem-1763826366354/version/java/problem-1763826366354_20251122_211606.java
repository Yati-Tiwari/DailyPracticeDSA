// Last updated: 11/22/2025, 9:16:06 PM
class Solution {
    public int minimumFlips(int n) {
        String stri=Integer.toBinaryString(n);
        Stack<Character> Ans=new Stack<>();
        for(char ch:stri.toCharArray()){
            Ans.push(ch);
        }
        StringBuilder reves=new StringBuilder();
        while(!Ans.isEmpty()){
            reves.append(Ans.pop());
        }
        int flps=0;
        for(int i=0;i<stri.length();i++){
            if(stri.charAt(i) != reves.charAt(i)){
                flps++;
            }
        }
        return flps;
    }
}