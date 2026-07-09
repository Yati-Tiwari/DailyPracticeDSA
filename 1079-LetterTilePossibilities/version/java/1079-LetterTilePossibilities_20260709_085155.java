// Last updated: 7/9/2026, 8:51:55 AM
1public class Solution {
2    public int numTilePossibilities(String tiles) {
3        char[] arr=tiles.toCharArray();
4        Arrays.sort(arr);
5        boolean[] used_arr=new boolean[arr.length];
6        return backtrack(arr, used_arr);
7    }
8
9    private int backtrack(char[] arr, boolean[] used_arr) {
10        int count=0;
11        for (int i=0; i < arr.length; i++) {
12            if (used_arr[i]) continue;
13            if (i > 0 && arr[i]==arr[i-1] && !used_arr[i-1]) 
14            {
15                continue;
16            }
17            used_arr[i]=true;
18            count += 1 + backtrack(arr, used_arr);
19            used_arr[i]=false;
20        }
21        return count;
22    }
23}
24