// Last updated: 2/6/2026, 11:51:09 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public static Node flatten(Node head) {
13        if (head==null){
14            return head;
15        }
16        Stack<Node> stack=new Stack<>();
17        Node curr=head;
18        while (curr!=null) {
19            if (curr.child!=null) {
20                if (curr.next!=null) {
21                    stack.push(curr.next);
22                }
23                curr.next=curr.child;
24                curr.child.prev=curr;  
25                curr.child=null;
26            }
27
28            if (curr.next==null && !stack.isEmpty()) {
29                curr.next=stack.pop();
30                curr.next.prev=curr;  
31            }
32            curr=curr.next;
33        }
34        return head;
35    }
36}