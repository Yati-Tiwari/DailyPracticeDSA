// Last updated: 2/23/2026, 5:06:28 PM
1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        int need=(int) Math.pow(2,k);  
4        HashSet<String> set=new HashSet<>();
5        for(int i=0; i<=s.length()-k; i++) {
6            String sub=s.substring(i,i+k);
7            if(!set.contains(sub)){
8                set.add(sub);
9                need--;
10                if(need==0)return true; 
11            }
12        }
13        return false;
14    }
15}