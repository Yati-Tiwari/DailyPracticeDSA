// Last updated: 3/22/2026, 5:50:38 PM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n=mat.length;
4        // Flags for each rotation possibility
5        boolean rot0=true,rot90=true, rot180=true, rot270=true;
6        for(int i=0; i<n; i++){
7            for(int j=0; j < n; j++) {
8                if(mat[i][j]!=target[i][j]){
9                    rot0=false;   // 0° rotation
10                    }            
11                if(mat[i][j]!=target[j][n-1-i]){  // 90° rotation
12                    rot90=false;
13                }
14                if(mat[i][j] != target[n-1-i][n-1-j]){ //180° rotation
15                    rot180=false;
16                }
17                if (mat[i][j] != target[n-1-j][i]){     //270° rotation
18                    rot270=false;     
19                }
20            }
21        }
22        return rot0 || rot90 || rot180 || rot270;
23    }
24}