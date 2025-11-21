// Last updated: 11/21/2025, 7:57:13 PM
class Solution{
    public int minRefuelStops(int target,int startFuel,int[][] stations){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int fuel=startFuel;
        int i=0;
        int stops=0;
        while(fuel<target){
            while(i<stations.length && stations[i][0]<=fuel){
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                return-1;
            }
            fuel+=pq.poll();
            stops++;
        }
        return stops;
    }
}
