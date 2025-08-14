// Last updated: 8/14/2025, 11:20:38 AM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] Count=new int[1001];
        for (int i=0; i < arr1.length; i++) {
            Count[arr1[i]]++;
        }
        int idx=0;
        for (int i=0; i < arr2.length; i++) {
            while (Count[arr2[i]] > 0) {
                arr1[idx++]=arr2[i];
                Count[arr2[i]]--;
            }
        }
        for (int i=0; i < Count.length; i++) {
            while (Count[i] > 0) {
                arr1[idx++]=i;
                Count[i]--;
            }
        }
        return arr1;
    }
}
