// Last updated: 1/27/2026, 3:04:21 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        List<Integer> ll=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            ll.add(i);
6        }
7        int idx=0;
8        while(ll.size()>1){
9            int r=(idx+k-1)%ll.size();
10            ll.remove(r);
11            idx=r;
12        }
13        return ll.get(0);
14    }
15}