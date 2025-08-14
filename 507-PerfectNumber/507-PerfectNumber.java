// Last updated: 8/14/2025, 11:23:28 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num<=1) {
            return false;
        }
        int sum=1; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int other_num = num / i;
                if (other_num != i) {
                    sum += other_num;
                }
            }
        }
        return sum==num;
    }
}
