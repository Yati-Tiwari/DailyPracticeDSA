// Last updated: 8/14/2025, 11:18:56 AM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int size = (n + k-1) / k;  
        String[] result=new String[size];
        int idx=0;  
        for (int i=0; i < n; i += k) {
            StringBuilder group = new StringBuilder();
            for (int j=i; j < i + k; j++) {
                if (j < n) {
                    group.append(s.charAt(j));
                } else {
                    group.append(fill);
                }
            }
            result[idx++]=group.toString();
        }
        return result;
    }
}
