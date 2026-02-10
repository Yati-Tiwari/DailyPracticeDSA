// Last updated: 2/10/2026, 4:02:00 PM
1class Solution{
2    public int longestBalanced(int[] arr){
3        int len=arr.length;
4        int ans=0;
5        for(int i=0; i<len;i++){
6            HashSet<Integer> even=new HashSet<>();
7            HashSet<Integer> odd=new HashSet<>();
8            for(int j=i;j<len;j++){
9                int v=arr[j];
10                if(v%2==0){
11                    even.add(v);
12                }
13                else odd.add(v);
14                if(even.size()== odd.size()){
15                    ans=Math.max(ans, j-i+1);
16                }
17            }
18        }
19        return ans;
20    }
21}
22