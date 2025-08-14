// Last updated: 8/14/2025, 11:17:39 AM
class Solution {
    public String removeTrailingZeros(String num) {
        int end=num.length()-1;
        while(end>=0 && num.charAt(end)=='0'){
            end--;
        }
        return num.substring(0,end+1);
    }
}