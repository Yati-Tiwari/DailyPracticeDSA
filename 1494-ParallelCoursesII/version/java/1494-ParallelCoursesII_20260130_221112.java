// Last updated: 1/30/2026, 10:11:12 PM
1class Solution {
2    public int minNumberOfSemesters(int n, int[][] relations, int k) {
3        //prereqMask[i]=konsa course pehle chahiye course i ke liye
4
5        int[] p=new int[n];  /// p=>prereqMask 
6        // prerequisites build karo
7        for(int i=0; i<relations.length; i++){
8            int x=relations[i][0]-1;
9            int y=relations[i][1]-1;
10            p[y] +=(int)Math.pow(2,x);
11        }
12        int N=(int)Math.pow(2,n); //'' total states
13        int[] dp=new int[N];
14        Arrays.fill(dp,Integer.MAX_VALUE);
15        dp[0]=0; // koi course nahi liya -> 0 semester
16
17        // /har state check karo
18        for(int mask=0; mask<N; mask++){
19            if(dp[mask]==Integer.MAX_VALUE){
20                continue;
21            }
22            int c=0; // c:canTake
23            // kaunse course ab le sakte hai
24            for(int i=0; i<n; i++){
25                int bit=(int)Math.pow(2,i);
26                // agar course i abhi tak nahi liya
27                // aur uske saare prereq complete ho chuke
28                if((mask & bit)==0 && (p[i] & mask)==p[i]){
29                    c+=bit;
30                }
31            }
32            //canTake ke sab subsets try karo (≤ k courses)
33            for(int j=c;j> 0;j= (j-1) & c){  // j=sub
34                if(Integer.bitCount(j) <=k){
35                    int newMask=mask | j;
36                    dp[newMask]=Math.min(dp[newMask],dp[mask]+1);
37                }
38            }
39        }
40        //. full mask=saare course complete
41        return dp[N-1];
42    }
43}
44