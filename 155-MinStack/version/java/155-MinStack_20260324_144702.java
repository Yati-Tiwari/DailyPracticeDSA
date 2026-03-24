// Last updated: 3/24/2026, 2:47:02 PM
1class MinStack {
2    private Stack<Integer> stack;
3    private Stack<Integer> mini;
4    
5    public MinStack() {
6        stack = new Stack<>();
7        mini = new Stack<>();
8    }
9    
10    public void push(int val) {
11        stack.push(val);
12        // Push the new min value
13        if (mini.isEmpty() || val <= mini.peek()) {
14            mini.push(val);
15        } else {
16            mini.push(mini.peek());
17        }
18    }
19    
20    public void pop() {
21        if (!stack.isEmpty()) {
22            stack.pop();
23            mini.pop();
24        }
25    }
26    
27    public int top() {
28        return stack.peek();
29    }
30    
31    public int getMin() {
32        return mini.peek();
33    }
34}
35
36/**
37 * Example usage:
38 * MinStack obj = new MinStack();
39 * obj.push(-2);
40 * obj.push(0);
41 * obj.push(-3);
42 * System.out.println(obj.getMin()); // -3
43 * obj.pop();
44 * System.out.println(obj.top());    // 0
45 * System.out.println(obj.getMin()); // -2
46 */
47