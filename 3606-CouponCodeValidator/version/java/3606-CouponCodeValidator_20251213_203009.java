// Last updated: 12/13/2025, 8:30:09 PM
1class Solution {
2    public int[] getNoZeroIntegers(int n) {
3        int[] ans=new int[2];
4        for (int a=1;a<n;a++) {
5            int b=n-a;
6            int x=a;
7            int y=b;
8            boolean zero=false;
9            while (x > 0) {
10                if (x % 10==0) {
11                    zero=true;
12                    break;
13                }
14                x/=10;
15            }
16            while (!zero && y > 0) {
17                if (y % 10==0) {
18                    zero=true;
19                    break;
20                }
21                y/=10;
22            }
23            if (!zero) {
24                ans[0]=a;
25                ans[1]=b;
26                break;
27            }
28        }
29        return ans;
30    }
31}
32