// Last updated: 12/18/2025, 6:38:36 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m=word1.length();
4        int n=word2.length();
5        if (n>m) {
6            return minDistance(word2,word1);
7        }
8        int[] prev=new int[n+1];
9        int[] cur=new int[n+1];
10        for (int j=0;j<=n;j++) {
11            prev[j]=j;
12        }
13        for (int i=1;i<=m;i++) {
14            cur[0]=i;
15            for (int j=1;j <=n;j++) {
16                if (word1.charAt(i-1)==word2.charAt(j-1)) {
17                    cur[j]=prev[j-1];
18                } else {
19                    cur[j]=1 +Math.min(prev[j-1],Math.min(prev[j],cur[j-1]) 
20                    );
21                }
22            }
23            int[] temp=prev;
24            prev=cur;
25            cur=temp;
26        }
27        int ans=prev[n];
28        return ans;
29    }
30}
31