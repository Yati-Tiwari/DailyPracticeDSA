// Last updated: 12/22/2025, 7:52:06 PM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if(n==0){
4            return 1;
5        }
6        if(n==10){
7            return 10;
8        }
9        int count=10;
10        int unique_nums=9;
11        int available_nums=9;
12        for(int i=2;i<=n;i++){
13            unique_nums*=available_nums;
14            count+=unique_nums;
15            available_nums--;
16        }
17        return count;
18    }
19}