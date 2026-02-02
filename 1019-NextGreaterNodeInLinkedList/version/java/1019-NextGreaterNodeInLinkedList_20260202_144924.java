// Last updated: 2/2/2026, 2:49:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        // Store linked list values in ArrayList
14        ArrayList<Integer> ll=new ArrayList<>();
15        ListNode curr=head;
16        while(curr !=null){
17            ll.add(curr.val);
18            curr=curr.next;
19        }
20        int n=ll.size();
21        int[] ans=new int[n];          // result array
22        Stack<Integer> st=new Stack<>(); // stack stores indices
23
24        for(int i=0; i<n; i++){
25            // If current value is greater than stack top value
26            while(!st.isEmpty() && ll.get(i)>ll.get(st.peek())){
27                int idx=st.pop();
28                ans[idx]=ll.get(i); // next greater element
29            }
30            // push index into stack
31            st.push(i);
32        }
33        // Remaining indices have no greater element → default 0
34        return ans;
35    }
36}
37