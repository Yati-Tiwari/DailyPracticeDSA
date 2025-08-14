// Last updated: 8/14/2025, 11:23:52 AM
class Solution {
    public int compress(char[] chars) {
        int Index=0;
        int i=0;     
        while (i<chars.length) {
            char Current_Char=chars[i];
            int Count=0;           
            while (i<chars.length && chars[i]==Current_Char) {
                i++;
                Count++;
            }          
            chars[Index++]=Current_Char;           
            if (Count > 1) {
                String Count_String = Integer.toString(Count);
                for (int j =0;j < Count_String.length();j++) {
                    chars[Index++]=Count_String.charAt(j);
                }
            }
        }      
        return Index;
    }
}
