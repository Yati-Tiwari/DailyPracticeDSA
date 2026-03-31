// Last updated: 3/31/2026, 11:53:52 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode intersection=null;
15        ListNode curr1=headA;
16        ListNode curr2=headB;
17        //length finding can also be used
18         while (curr1 != curr2) {
19           if(curr1==null){
20                curr1=headB;
21           }else{
22            curr1=curr1.next;
23           }
24            if(curr2==null){
25                curr2=headA;
26           }else{
27            curr2=curr2.next;
28           }
29        }
30        return curr1; // curr2 can also be return
31    }
32}