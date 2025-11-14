// Last updated: 11/14/2025, 1:25:00 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead=new ListNode(0);
        ListNode BigHead=new ListNode(0);
        ListNode small=smallHead;
        ListNode Big=BigHead;
        while(head != null){
            if(head.val < x){
                small.next=head;
                small=small.next;
            }else{
                Big.next=head;
                Big=Big.next;
            }
            head=head.next;
        }
        Big.next=null;
        small.next=BigHead.next; // dono small aur big nodes connect
        return smallHead.next;
    }
}