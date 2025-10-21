// Last updated: 10/21/2025, 9:45:32 PM
class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char val=num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() >val) {
                stack.pop();
                k--;
            }
            stack.push(val);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        while (sb.length() > 1 && sb.charAt(0)== '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
