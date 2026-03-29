// Last updated: 3/29/2026, 12:54:31 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ll=new ArrayList<>();
4        List<String> list=new ArrayList<>();
5        partition(s,list,ll);
6        return ll;
7
8    }
9    public static void partition(String s,List<String>list,List<List<String>> ll){
10        if(s.length()==0){
11            ll.add(new ArrayList<String>(list));
12            return;
13        }
14
15        for(int i=1;i<=s.length();i++){
16            String sp=s.substring(0,i);
17            if(check(sp)){
18                list.add(sp);
19                partition(s.substring(i),list,ll);
20                list.remove(list.size()-1);
21            }
22        }
23
24    }
25    public static boolean check(String s) {
26        int i=0;
27        int j=s.length()-1;
28        while(i<=j) {
29            if(s.charAt(i)!=s.charAt(j)) {
30                return false;
31            }
32            i++;
33            j--;
34        }
35        return true;
36    }
37}