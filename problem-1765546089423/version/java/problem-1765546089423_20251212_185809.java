// Last updated: 12/12/2025, 6:58:09 PM
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
12    public ListNode sortList(ListNode head) {
13        if (head==null || head.next==null){
14            return head;
15        }
16        ListNode slow=head;
17        ListNode fast=head;
18        ListNode prev=null;
19        while (fast !=null && fast.next != null) {
20            prev=slow;
21            slow=slow.next;
22            fast=fast.next.next;
23        }
24        prev.next=null;
25        ListNode left=sortList(head);
26        ListNode right=sortList(slow);
27        return merge(left,right);
28    }
29    public ListNode merge(ListNode a, ListNode b) {
30        ListNode dummy=new ListNode(0);
31        ListNode curr=dummy;
32        while (a!=null && b!=null) {
33            if (a.val<b.val) {
34                curr.next=a;
35                a=a.next;
36            } else{
37                curr.next=b;
38                b=b.next;
39            }
40            curr=curr.next;
41        }
42        if (a != null){
43            curr.next=a;
44        }
45        if (b!=null){
46            curr.next=b;
47        }
48        return dummy.next;
49    }
50}
51