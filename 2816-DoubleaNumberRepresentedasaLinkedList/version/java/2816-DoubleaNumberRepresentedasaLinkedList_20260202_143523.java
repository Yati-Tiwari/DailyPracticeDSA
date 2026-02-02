// Last updated: 2/2/2026, 2:35:23 PM
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
12    public ListNode doubleIt(ListNode head) {
13        ListNode temp=rev(head);
14        ListNode nn=new ListNode();
15        ListNode dummy=nn;
16       // ListNode temp=head;
17        int carry=0;
18        while(temp!=null){
19            int val=temp.val*2;
20            int rem=val%10;
21            nn.next=new ListNode(rem+carry);
22            carry=val/10;
23            temp=temp.next;
24            nn=nn.next;
25        }
26        if(carry>0){
27           nn.next=new ListNode(carry);
28        }
29        dummy=dummy.next;
30       return rev(dummy);
31    }
32    public ListNode rev(ListNode head) {
33			ListNode curr=head;
34			ListNode prev=null;
35			while (curr !=null) {
36				ListNode ahead=curr.next;
37				curr.next=prev;
38				prev=curr;
39				curr=ahead;
40			}
41			return prev;
42
43		}
44}