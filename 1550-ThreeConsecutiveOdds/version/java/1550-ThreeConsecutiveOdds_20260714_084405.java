// Last updated: 7/14/2026, 8:44:05 AM
1class Solution {
2    public boolean threeConsecutiveOdds(int[] arr) {
3        int count=0;
4        for(int i=0;i<arr.length;i++){
5            if(arr[i]%2!=0){
6                count++;
7                if(count==3){
8                    return true;
9                }
10            }
11            else{
12                    count=0;
13                }
14        }
15        return false;
16    }
17}