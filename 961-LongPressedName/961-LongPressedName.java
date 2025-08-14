// Last updated: 8/14/2025, 11:21:28 AM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int n=name.length();
        int t=typed.length();
        for(int j=0;j<t;j++){
            if(i<n&& name.charAt(i)==typed.charAt(j)){
                i++;
            }
            else if(j==0 || typed.charAt(j)!=typed.charAt(j-1)){
                return false;
            }
        }
        return i==n;
    }
}