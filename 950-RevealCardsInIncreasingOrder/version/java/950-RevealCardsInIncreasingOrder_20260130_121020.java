// Last updated: 1/30/2026, 12:10:20 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        int n=deck.length;
4        Arrays.sort(deck); // sort the deck
5        Deque<Integer> dq=new ArrayDeque<>();
6        //reverse simulate the process
7        for (int i =n-1; i>=0; i--) {
8            if (!dq.isEmpty()) {
9                dq.addFirst(dq.removeLast()); // rotate: move last to front
10            }
11            dq.addFirst(deck[i]); // place current card at front
12        }
13        //convert deque to array
14        int[] result=new int[deck.length];
15        int idx=0;
16        for (int card : dq) {
17            result[idx++]=card;
18        }
19        
20        return result;
21    }
22}