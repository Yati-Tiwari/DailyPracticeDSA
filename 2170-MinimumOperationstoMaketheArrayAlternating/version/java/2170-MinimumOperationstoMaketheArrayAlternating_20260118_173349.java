// Last updated: 1/18/2026, 5:33:49 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3       int n=nums.length;
4        Map<Integer,Integer> even=new HashMap<>();
5        Map<Integer,Integer> odd=new HashMap<>();
6        for (int i=0; i<n; i++) {
7            if (i % 2==0){
8                // /even index hai to even mein freq bda diya
9                even.put(nums[i],even.getOrDefault(nums[i],0)+1);
10            }
11            else{
12                // odd index hai to odd mein freq bda diya
13                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
14            }
15        }
16        int[][] e=Print(even); //top 2 frequency wale numbers extract (even side)
17        int[][] o=Print(odd);   //top 2 frequency wale numbers extract (odd side)
18        int maxKept=0;
19        //4 combinations check krne ke liye loop
20        for (int i =0; i<2; i++) {
21            for (int j=0; j<2; j++) {
22                // condition: even ka number aur odd ka number same nhi hona chahiye
23                if (e[i][0] !=o[j][0]) { //
24                    maxKept=Math.max(maxKept,e[i][1] + o[j][1]);//// maximum kitna same reh skta hai
25                }
26            }
27        }
28        return n-maxKept; // total - jo same reh gya wo final ops hai
29    }
30    //ye function map me se top 2 freq wale number nikalta hai
31    public int[][] Print(Map<Integer,Integer> map) {
32        int[][] rslt={{-1, 0}, {-1, 0}}; // [value, freq]
33        for (int key : map.keySet()) {
34            int f=map.get(key);
35            if (f > rslt[0][1]) {
36                rslt[1]=rslt[0];
37                rslt[0]=new int[]{key,f};
38            } else if (f > rslt[1][1]) { //second max freq wala
39                rslt[1]=new int[]{key,f};
40            }
41        }
42        return rslt;
43    }
44}