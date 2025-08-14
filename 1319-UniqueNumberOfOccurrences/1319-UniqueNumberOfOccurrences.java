// Last updated: 8/14/2025, 11:20:25 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] freq = new int[arr.length + 1];      
        int i = 0;
        while (i < arr.length) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            if (freq[count] == 1) {
                return false;
            }
            freq[count] = 1;
            i++;
        }        
        return true;
    }
}
