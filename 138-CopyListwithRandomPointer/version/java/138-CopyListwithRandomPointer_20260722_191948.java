// Last updated: 7/22/2026, 7:19:48 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if(head==null){
19            return null;
20        }
21        HashMap<Node,Node> map=new HashMap<>();
22        Node current=head;
23        while(current !=null){
24            map.put(current,new Node(current.val));
25            current=current.next;
26        }
27        current=head;
28        while(current != null){
29            Node copy=map.get(current);
30            copy.next=map.get(current.next);
31            copy.random=map.get(current.random);
32            current=current.next;
33        }
34        return map.get(head);
35        
36    }
37}