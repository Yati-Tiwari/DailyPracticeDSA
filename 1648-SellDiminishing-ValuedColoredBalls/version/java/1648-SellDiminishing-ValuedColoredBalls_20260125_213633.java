// Last updated: 1/25/2026, 9:36:33 PM
1class Solution {
2    public static int maxProfit(int[] inventory, int orders) {
3        int mod=(int) 1000000000+7;   // modulo value avoid overflow krne k liye
4        long profit=0;           //variable to store total profit
5        int k=smallestK(inventory,orders); //find smallest k using binary search
6        for (int i=0; i < inventory.length; i++) {
7            int inv=inventory[i];
8            if (inv > k) {
9            // calculate kiya sum of arithmetic progression for values greater than k
10                profit=(profit + 1L * (inv+k+1) * (inv-k) /2) % mod;
11                orders=orders-(inv - k); // reduce remaining orders
12            }
13        }
14        // add remaining orders multiplied by k
15        return (int) ((profit + 1L* orders *k) % mod);
16    }
17    static int smallestK(int[] inventory, int target) {
18        int max=Integer.MIN_VALUE; // find maximum value in inventory
19        for (int i=0; i < inventory.length; i++) {
20            max=Math.max(max,inventory[i]);
21        }
22        int l=0, r=max; // l:left,r:right
23        // binary search to find smallest k
24        while(l<r){
25            int mid=l+ (r-l) / 2;
26            if(sum(inventory,mid) > target){
27                l= mid +1;
28            }
29            else{
30                r=mid;
31            }
32        }
33        return l;
34    }
35    static long sum(int[] inventory,int k) {
36        long sum=0;
37        // calculate how many items are above k
38        for(int i=0;i<inventory.length;i++) {
39            if(inventory[i] > k){
40                sum +=inventory[i]-k;
41            }
42        }
43        return sum;
44    }
45}