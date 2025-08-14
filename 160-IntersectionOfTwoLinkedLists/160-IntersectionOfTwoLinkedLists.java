// Last updated: 8/14/2025, 11:25:39 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersection=null;
        ListNode curr1=headA;
        ListNode curr2=headB;
        //length finding can also be used
         while (curr1 != curr2) {
           if(curr1==null){
                curr1=headB;
           }else{
            curr1=curr1.next;
           }
            if(curr2==null){
                curr2=headA;
           }else{
            curr2=curr2.next;
           }
        }
        return curr1; // curr2 can also be return
    }
}