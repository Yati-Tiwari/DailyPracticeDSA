// Last updated: 8/14/2025, 11:26:20 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null || left==right)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode Prev=dummy;
        for (int i =1;i < left;i++) {
            Prev=Prev.next;
        }
        ListNode Current=Prev.next;
        ListNode next=null;
        for (int i=0;i < right-left;i++) {
            next=Current.next;
            Current.next=next.next;
            next.next=Prev.next;
            Prev.next=next;
        }

        return dummy.next;
    }
}
