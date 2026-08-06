// Last updated: 8/6/2026, 7:04:28 PM
1class Solution {
2    public int smallestNumber(int n,int t) {
3        while(true) {
4            if(isValid(n,t)) {
5                return n;
6            }
7            n++;
8        }
9    }
10    public boolean isValid(int num,int t) {
11        int product=1;
12        int temp=num;
13        while(temp > 0) {
14            int digit=temp % 10;
15            product *=digit;
16            temp/=10;
17        }
18        return product % t==0;
19    }
20}
21