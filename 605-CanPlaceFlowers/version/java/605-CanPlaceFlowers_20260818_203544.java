// Last updated: 8/18/2026, 8:35:44 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int count=0; // flowers placed
4        int length=flowerbed.length;
5        for(int i=0;i<length;i++){
6            // check if current plot is empty AND neighbors are empty or boundary
7            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==length-1 || flowerbed[i+1]==0)){
8                flowerbed[i]=1; // place flower
9                count++;           // increase placed flowers
10                if(count>=n){  // early exit if enough flowers
11                    return true; 
12                }
13            }
14        }
15        return count>=n; // return if enough flowers could be placed
16    }
17}
18