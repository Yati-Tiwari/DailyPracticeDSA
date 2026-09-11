// Last updated: 9/11/2026, 7:34:52 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int[] f=new int[10];
4        int res=0;
5        for(int d : digits){
6            f[d]++;
7        }
8        for(int i=1; i < 10; i++) 
9            for(int j=0; j < 10; j++) 
10                for(int k=0; k<9; k+=2) {
11                    f[i]--; 
12                    f[j]--; 
13                    f[k]--;
14                    if(f[i] >=0 && f[j] >= 0 && f[k] >= 0){
15                        res++;
16                    }
17                    f[i]++; f[j]++; f[k]++;
18                }           
19        return res;
20    }
21}