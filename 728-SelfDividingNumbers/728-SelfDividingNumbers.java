// Last updated: 8/14/2025, 11:22:23 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rslt=new ArrayList<>();
        for (int i=left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing=true;
            while (num > 0) {
                int digit=num % 10;
                if (digit==0 || i % digit != 0) {
                    isSelfDividing=false;
                    break;
                }
                num /= 10;
            }
            if (isSelfDividing) {
                rslt.add(i);
            }
        }
        return rslt;
    }
}
