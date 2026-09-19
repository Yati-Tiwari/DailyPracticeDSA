// Last updated: 9/19/2026, 6:16:43 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        List<Integer> ll=new ArrayList<>(); // Arraylist used for variable size
4        for(int i=1;i<=n;i++){
5            ll.add(i); // add all index in a list
6        }
7        int idx=0;  // take variable idx to store index of who just lost and repeat
8        while(ll.size()>1){
9            int r=(idx+k-1)%ll.size();
10            ll.remove(r)        ; // remove index of just lost
11            idx=r; // sore r in idx for update 
12        }
13        return ll.get(0); // winner ;last friend
14    }
15}