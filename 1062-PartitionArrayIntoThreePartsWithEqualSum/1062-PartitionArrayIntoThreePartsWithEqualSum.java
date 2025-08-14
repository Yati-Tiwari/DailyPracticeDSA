// Last updated: 8/14/2025, 11:20:58 AM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int Sum=0;
        for (int i=0; i<arr.length; i++) {
            Sum += arr[i];
        }
        if (Sum % 3 != 0) {
            return false;
        }
        int Partition=Sum / 3;
        int temp=0;
        int count=0;
        for (int i=0; i< arr.length; i++) {
            temp += arr[i];
            if (temp== Partition) {
                count++;
                temp = 0;
            }
        }
        if (count>=3) {
            return true;
        } else {
            return false;
        }
    }
}
