// Last updated: 5/31/2026, 12:29:09 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long curr_mass=mass;
5        for(int i=0; i<asteroids.length;i++){
6            if(asteroids[i] > curr_mass){
7                return false;
8            }
9            curr_mass+=asteroids[i];
10        }
11        return true;
12    }
13}