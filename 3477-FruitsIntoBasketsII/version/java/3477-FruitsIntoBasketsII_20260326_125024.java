// Last updated: 3/26/2026, 12:50:24 PM
1class Solution {
2    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
3        int n=fruits.length;
4        boolean[] used=new boolean[n];
5        int c=0;
6        for(int i=0;i<n;i++){
7            boolean placed=false;
8            for(int j=0;j<baskets.length;j++){
9                if(!used[j] && baskets[j]>=fruits[i]){
10                    used[j]=true;
11                    placed=true;
12                    break;
13                }
14            }
15            if(!placed){
16                c++;
17            }
18        }
19        return c;
20        
21    }
22}