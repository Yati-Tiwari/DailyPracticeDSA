// Last updated: 8/14/2025, 11:20:32 AM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int TotalSum=0;
        for (int i=0; i < nums.length; i++) {
            int n=nums[i];
            int count=0;
            int sum=0;
            for (int j=1; j * j <= n; j++) {
                if (n % j ==0) {
                    int x=n / j;
                    if (j==x) {
                        count++;
                        sum += j;
                    } else {
                        count += 2;
                        sum += j+x;
                    }
                    if (count > 4) {
                        break;
                    }
                }
            }
            if (count==4) {
                TotalSum += sum;
            }
        }
        return TotalSum;
    }
}
