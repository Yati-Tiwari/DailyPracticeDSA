// Last updated: 8/14/2025, 11:25:02 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        ListNode nn=node.next;
        node.next=node.next.next;
        // node.next.next=null;
    }
}