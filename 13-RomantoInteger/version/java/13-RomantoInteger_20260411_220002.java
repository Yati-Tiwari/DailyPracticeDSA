// Last updated: 4/11/2026, 10:00:02 PM
1class Solution {
2    public int romanToInt(String s) {
3        char[] symbols={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
4        int[] values ={1, 5, 10, 50, 100, 500, 1000};
5        int total=0;
6        int prevValue=0;
7        for (int i=s.length() - 1; i >= 0; i--) {
8            char currentChar=s.charAt(i);
9            int currentValue=0;
10            for (int j=0; j < symbols.length; j++) {
11                if (symbols[j] == currentChar) {
12                    currentValue=values[j];
13                    break;
14                }
15            }
16            if (currentValue < prevValue) {
17                total -= currentValue;
18            } else {
19                total += currentValue;
20            }
21            prevValue=currentValue;
22        }
23        return total;
24    }
25}
26