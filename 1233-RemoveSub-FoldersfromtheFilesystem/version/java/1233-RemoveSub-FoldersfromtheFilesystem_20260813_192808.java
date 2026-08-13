// Last updated: 8/13/2026, 7:28:08 PM
1class Solution {
2    public List<String> removeSubfolders(String[] folder) {
3        Arrays.sort(folder);
4        List<String> res=new ArrayList<>();
5        res.add(folder[0]);
6        for(int i=1;i<folder.length; i++){
7            String last= res.get(res.size() - 1);
8            if(!folder[i].startsWith(last + "/")){
9                res.add(folder[i]);
10            }
11        }
12        return res;
13    }
14}