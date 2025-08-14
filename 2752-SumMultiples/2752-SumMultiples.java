// Last updated: 8/14/2025, 11:17:44 AM
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                sum+=i;
            }
        }
       return sum;
    }
}