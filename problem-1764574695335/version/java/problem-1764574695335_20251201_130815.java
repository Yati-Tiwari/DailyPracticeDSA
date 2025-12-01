// Last updated: 12/1/2025, 1:08:15 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy=new ListNode(0);
14        ListNode current=dummy;
15        int carry=0;
16        while(l1!=null || l2!=null || carry>0){
17            int a=0;
18            int b=0;
19            if(l1!=null){
20                a=l1.val;
21                l1=l1.next;
22            }
23            if(l2!=null){
24                b=l2.val;
25                l2=l2.next;
26            }
27            int sum=a+b+carry;
28            carry=sum/10;
29            current.next=new ListNode(sum % 10);
30            current=current.next;
31        }
32        return dummy.next;
33    }
34}