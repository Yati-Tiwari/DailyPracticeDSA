// Last updated: 2/9/2026, 9:58:19 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        for(int s:stones){
5            pq.add(s);
6        }
7        while(pq.size()>1){
8            int a=pq.poll();
9            int b=pq.poll();
10            if(a!=b){
11                pq.add(a-b);// if a>b always maxheap hogi
12            }
13        }
14        if(pq.isEmpty()){
15            return 0;
16        }
17        else{
18            return pq.peek();
19        }
20    }
21}