// Last updated: 5/20/2026, 4:07:15 PM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n=A.length;
4        boolean[] seenA=new boolean[n+1];
5        boolean[] seenB=new boolean[n+1];
6        int[] C=new int[n];
7        int commonCnt=0;    
8        for(int i=0; i<n; i++){
9            seenA[A[i]]=true;
10            seenB[B[i]]=true;        
11            if(seenB[A[i]]){
12                commonCnt++;
13            }
14            if(seenA[B[i]] && A[i] !=B[i]){
15                commonCnt++;
16            }       
17            C[i]=commonCnt;
18        }     
19        return C;
20    }
21}
22