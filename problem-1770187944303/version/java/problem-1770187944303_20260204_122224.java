// Last updated: 2/4/2026, 12:22:24 PM
1class Trie {
2
3    class Node{
4		char ch;
5		boolean isTerminal;
6		HashMap<Character,Node> child;
7		Node(char ch){
8			this.ch=ch;
9			child=new HashMap<>();
10		}
11	}
12	private Node root;
13	public Trie(){
14		root=new Node('*');
15	}
16	public void insert(String word) { //complexity of insert = length of word 
17		Node curr=root;
18		for(int i=0;i<word.length();i++) {
19			char ch=word.charAt(i);
20			if(curr.child.containsKey(ch)){
21				curr=curr.child.get(ch); //already there so just move current 
22			}else {
23				Node nn=new Node(ch); 
24				curr.child.put(ch,nn);
25				curr=nn;
26			}
27		}
28		curr.isTerminal=true;
29	}
30	public boolean search(String word) {
31		Node curr=root;
32		for(int i=0;i<word.length();i++) {
33			char ch=word.charAt(i);
34			if(curr.child.containsKey(ch)){
35				curr=curr.child.get(ch); //ch is present
36			}else {
37				return false;
38			}
39		}
40		return curr.isTerminal; // end of the word or not 
41	 }
42	public boolean startsWith(String word) { //asking for prefix
43		Node curr=root;
44		for(int i=0;i<word.length();i++) {
45			char ch=word.charAt(i);
46			if(curr.child.containsKey(ch)){
47				curr=curr.child.get(ch); //ch is present
48			}else {
49				return false;
50			}
51		}
52		return true;
53    }
54}
55
56/**
57 * Your Trie object will be instantiated and called as such:
58 * Trie obj = new Trie();
59 * obj.insert(word);
60 * boolean param_2 = obj.search(word);
61 * boolean param_3 = obj.startsWith(prefix);
62 */