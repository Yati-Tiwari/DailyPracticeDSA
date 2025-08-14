// Last updated: 8/14/2025, 11:18:10 AM
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i=0;i<=num;i++) {
            int reverse=0;
            int temp=i;
            while (temp>0) {
                reverse= reverse* 10+temp % 10;
                temp=temp/10;
            }
            if (i + reverse==num) {
                return true;
            }
        }
        return false;
    }
}