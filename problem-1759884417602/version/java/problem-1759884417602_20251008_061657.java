// Last updated: 10/8/2025, 6:16:57 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head==null || head.next==null) {
            return;
        }
        // step 1: middle nikalne ke liye slow-fast pointer lagaya
        ListNode slow=head, fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // step 2: middle ke baad ka part reverse kar liya
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next = null;  // list ko do part me tod diya

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // ab prev ke pass reversed list ka head hai
        ListNode first=head;
        ListNode second = prev;

        // step 3: dono list ko ek ek karke merge kar diya
        while (second != null) {
            ListNode temp1=first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first=temp1;
            second=temp2;
        }
    }
}
