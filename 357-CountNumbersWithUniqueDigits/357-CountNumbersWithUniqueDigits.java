// Last updated: 8/14/2025, 11:24:28 AM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==10){
            return 10;
        }
        int count=10;
        int unique_nums=9;
        int available_nums=9;
        for(int i=2;i<=n;i++){
            unique_nums*=available_nums;
            count+=unique_nums;
            available_nums--;
        }
        return count;
    }
}