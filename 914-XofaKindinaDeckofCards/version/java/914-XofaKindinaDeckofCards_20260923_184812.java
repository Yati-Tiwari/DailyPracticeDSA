// Last updated: 9/23/2026, 6:48:12 PM
1class Solution {
2    public boolean hasGroupsSizeX(int[] deck) {
3        int[] count = new int[10000];
4        for (int i = 0; i < deck.length; i++) {
5            count[deck[i]]++;
6        }
7        int gcd = 0;
8        for (int i = 0; i < count.length; i++) {
9            if (count[i] > 0) {
10                if (gcd == 0) {
11                    gcd = count[i];
12                } else {
13                    gcd = computeGCD(gcd, count[i]);
14                }
15            }
16        }
17        return gcd >= 2;
18    }
19
20    public int computeGCD(int a, int b) {
21        while (b != 0) {
22            int temp = b;
23            b = a % b;
24            a = temp;
25        }
26        return a;
27    }
28}
29