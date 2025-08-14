// Last updated: 8/14/2025, 11:27:19 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) 
        {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
