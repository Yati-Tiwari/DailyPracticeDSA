// Last updated: 1/23/2026, 2:13:38 PM
1class Solution {
2    public long maxTotal(int[] value, int[] limit) {
3        int n=limit.length;
4        int[][] arr=new int[n][2];
5        for (int i=0; i<n; i++) {
6            arr[i][1]=value[i];
7            arr[i][0]=limit[i];
8        }
9        Arrays.sort(arr, (a,b) ->{
10            if(a[0]==b[0]){
11                return Integer.compare(b[1],a[1]);
12            }
13            return Integer.compare(a[0],b[0]);}); 
14        int j=0;
15        long maxtotl=0;
16        for (int i=0; i<n;) {
17            maxtotl +=arr[i][1];
18            i++;
19            int actve=i-j;
20            while(j<n && arr[j][0]<=actve){
21                j++;
22            }
23            while(j>i){
24                i++;
25            }
26        }
27        return maxtotl;
28    }
29}