// Last updated: 1/20/2026, 1:51:42 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        int[] arr=new int[operations.length];
4        int idx=0;
5        for (int i=0; i < operations.length; i++) {
6            String op=operations[i];
7            if (op.equals("C")) {
8                idx--;
9            } else if (op.equals("D")) {
10                arr[idx]=2 *arr[idx-1];
11                idx++;
12            } else if (op.equals("+")) {
13                arr[idx]=arr[idx-1] +arr[idx-2];
14                idx++;
15            } else {
16                arr[idx]=Integer.parseInt(op);
17                idx++;
18            }
19        }
20        int sum=0;
21        for (int i=0;i<idx; i++) {
22            sum+=arr[i];
23        }
24        return sum;
25    }
26}
27