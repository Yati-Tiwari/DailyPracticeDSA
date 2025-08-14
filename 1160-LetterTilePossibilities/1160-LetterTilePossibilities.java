// Last updated: 8/14/2025, 11:20:46 AM
public class Solution {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        boolean[] used_arr= new boolean[arr.length];
        return backtrack(arr, used_arr);
    }

    private int backtrack(char[] arr, boolean[] used_arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (used_arr[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !used_arr[i - 1]) 
            {
                continue;
            }
            used_arr[i] = true;
            count += 1 + backtrack(arr, used_arr);
            used_arr[i] = false;
        }
        return count;
    }
}
