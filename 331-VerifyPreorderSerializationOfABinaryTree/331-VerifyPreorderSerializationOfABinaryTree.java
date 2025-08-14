// Last updated: 8/14/2025, 11:24:36 AM
class Solution {
    public boolean isValidSerialization(String preorder) {
        int slots=1;
        String[] nodes=preorder.split(",");
        for (int i=0; i<nodes.length;i++) {
            if (slots==0) {
                return false;
            }
            if (nodes[i].equals("#")) {
                slots-=1;
            } else {
                slots+=1;
            }
        }
        return slots==0;
    }
}
