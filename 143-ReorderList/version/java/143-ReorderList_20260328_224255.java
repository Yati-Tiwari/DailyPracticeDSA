// Last updated: 3/28/2026, 10:42:55 PM
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
12    public void reorderList(ListNode head) {
13        if (head==null || head.next==null) {
14            return;
15        }
16        //middle nikalne ke liye slow-fast pointer lagaya
17        ListNode slow=head, fast=head;
18        while(fast != null && fast.next !=null) {
19            slow=slow.next;
20            fast=fast.next.next;
21        }
22        //middle ke baad ka part reverse kar liya
23        ListNode prev=null;
24        ListNode curr=slow.next;
25        slow.next=null;  // list ko do part me tod diya
26
27        while (curr !=null) {
28            ListNode nextNode=curr.next;
29            curr.next=prev;
30            prev=curr;
31            curr=nextNode;
32        }
33        // ab prev ke pass reversed list ka head hai
34        ListNode first=head;
35        ListNode second = prev;
36
37        // dono list ko ek ek karke merge kar diya
38        while (second != null) {
39            ListNode temp1=first.next;
40            ListNode temp2=second.next;
41
42            first.next=second;
43            second.next=temp1;
44            first=temp1;
45            second=temp2;
46        }
47    }
48}
49