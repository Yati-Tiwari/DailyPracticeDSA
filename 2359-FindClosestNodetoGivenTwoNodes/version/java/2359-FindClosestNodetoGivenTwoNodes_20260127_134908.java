// Last updated: 1/27/2026, 1:49:08 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        int[] d1=new int[edges.length];
4        int[] d2=new int[edges.length];
5        Arrays.fill(d1 ,-1);
6        Arrays.fill(d2, -1);
7        getDis(edges,node1,d1);
8        getDis(edges ,node2,d2);
9        int rslt =-1;
10        int minD=Integer.MAX_VALUE;
11        for(int i=0; i<edges.length;i++){
12            if(d1[i]!=-1 && d2[i] !=-1){
13                int curr=Math.max(d1[i],d2[i]);
14                if(minD>curr){
15                    minD=curr;
16                    rslt= i;
17                }
18            }
19        }
20        return rslt;
21    }
22    public static void getDis(int[] arr,int src, int[] d){
23        int indx=src;
24        int a=0;
25        while(indx!=-1 && d[indx]==-1){
26            d[indx]= a++;
27            indx=arr[indx];
28        }
29    }
30}
31