// Last updated: 8/14/2025, 11:23:56 AM
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        String[] Segments=s.split("\\s+");
        return Segments.length;
    }
}