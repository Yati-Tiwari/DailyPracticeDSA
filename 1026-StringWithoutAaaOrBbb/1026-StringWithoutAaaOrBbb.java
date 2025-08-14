// Last updated: 8/14/2025, 11:21:05 AM
class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder res=new StringBuilder();       
        while (A > 0 || B > 0) {
            if (A > B) {
                if (A > 0) {
                    res.append('a');
                    A--;
                }
                if (A > B && A > 0) {
                    res.append('a');
                    A--;
                }
                if (B > 0) {
                    res.append('b');
                    B--;
                }
            } else {
                if (B > 0) {
                    res.append('b');
                    B--;
                }
                if (B > A && B > 0) {
                    res.append('b');
                    B--;
                }
                if (A > 0) {
                    res.append('a');
                    A--;
                }
            }
        }      
        return res.toString();
    }
}
