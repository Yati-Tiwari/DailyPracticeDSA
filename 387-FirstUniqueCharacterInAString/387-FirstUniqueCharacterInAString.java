// Last updated: 8/14/2025, 11:24:18 AM
public class Solution{
    public int firstUniqChar(String s){
        int[] CharCount=new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            CharCount[index]++;
        }
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(CharCount[index]==1){
                return i;
            }
        }
        return -1;
    }
}