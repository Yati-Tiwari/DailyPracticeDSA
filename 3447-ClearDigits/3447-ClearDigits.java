// Last updated: 8/14/2025, 11:17:05 AM
class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        char[] arr=new char[n];
        int top=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                if(top>0){
                   top--;
                }
            }else{
                arr[top++]=ch;
            }
        }
        return new String(arr,0,top);
    }
}