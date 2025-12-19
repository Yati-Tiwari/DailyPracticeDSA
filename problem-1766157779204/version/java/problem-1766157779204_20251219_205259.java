// Last updated: 12/19/2025, 8:52:59 PM
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int n) {
3        Map<String, Integer> map=new HashMap<>();
4        while (n > 0) {
5            String s=Arrays.toString(cells);
6            if (map.containsKey(s)) {
7                int cycleLh=map.get(s)-n;
8                n %=cycleLh;
9            }
10            map.put(s,n);
11            if (n > 0) {
12                int[] ans=new int[8];
13                for (int i=1;i<7;i++) {
14                   if (cells[i-1]==cells[i+1]) {
15                        ans[i]=1;
16                    } else {
17                        ans[i]=0;
18                    }
19                }
20                cells=ans;
21                n--;
22            }
23        }
24        return cells;
25    }
26}
27