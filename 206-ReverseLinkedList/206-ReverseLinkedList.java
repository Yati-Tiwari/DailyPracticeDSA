// Last updated: 8/14/2025, 11:25:14 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        while(current!=null){
            ListNode ahead=current.next;
            current.next=previous;
            previous=current;
            current=ahead;
        }
        return previous;
    }
}