// Last updated: 10/21/2025, 9:39:28 PM
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> mini;
    
    public MinStack() {
        stack = new Stack<>();
        mini = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        // Push the new min value
        if (mini.isEmpty() || val <= mini.peek()) {
            mini.push(val);
        } else {
            mini.push(mini.peek());
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            mini.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}

/**
 * Example usage:
 * MinStack obj = new MinStack();
 * obj.push(-2);
 * obj.push(0);
 * obj.push(-3);
 * System.out.println(obj.getMin()); // -3
 * obj.pop();
 * System.out.println(obj.top());    // 0
 * System.out.println(obj.getMin()); // -2
 */
