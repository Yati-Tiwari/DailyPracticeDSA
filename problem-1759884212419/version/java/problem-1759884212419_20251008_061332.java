// Last updated: 10/8/2025, 6:13:32 AM
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        // sabhi node ke value ko ek list me daal diye
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // ab dono side se check karenge ki same hai ya nahi
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // agar dono end ke value same nahi hue to palindrome nahi hoga
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        // agar sab match kar gaye to palindrome hai
        return true;
    }
}
