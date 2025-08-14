// Last updated: 8/14/2025, 11:24:15 AM
class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int Step=1;
        boolean left=true;
        while (n>1) {
            if (left || n % 2 ==1) {
                head += Step;
            }
            Step *= 2;
            n /= 2;
            left = !left;
        }
        return head;
    }
}
