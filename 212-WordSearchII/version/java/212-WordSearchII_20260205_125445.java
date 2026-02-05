// Last updated: 2/5/2026, 12:54:45 PM
1class Solution {
2    static List<String> ll;
3    public List<String> findWords(char[][] board, String[] words) {
4        // in one search collect all words starts iwth char 0,0 of board in words
5       ll=new ArrayList<>();
6        Trie t=new Trie();
7		for(String s : words) {
8			t.insert(s);
9		}
10		for(int i=0;i<board.length;i++){
11            for(int j=0;j<board[0].length;j++){
12                if(t.root.child.containsKey(board[i][j])){
13                    t.Search(board,i,j,t.root);
14                }
15            }
16        }
17        return ll;
18    }
19    static class Trie{ //inner class ka object bna rhe ho ssliye aapko static bnana hoga
20		class Node{
21		char ch;
22		String isTerminal;
23		HashMap<Character,Node> child;
24			public Node(char ch) {
25				this.ch=ch;
26				child=new HashMap<>();
27			}
28		}
29		Node root=new Node('*'); // remove privste bcz node access required
30		public void insert(String word) { //complexity of insert = length of word 
31			Node curr=root;
32			for(int i=0;i<word.length();i++) {
33				char ch=word.charAt(i);
34				if(curr.child.containsKey(ch)){
35					curr=curr.child.get(ch); //already there so just move current 
36				}else {
37					Node nn=new Node(ch); 
38					curr.child.put(ch,nn);
39					curr=nn;
40				}
41			}
42			curr.isTerminal=word; 
43		}
44		public void Search(char[][]maze,int i ,int j, Node node){
45            if(i>=maze.length || i<0 || j>=maze[0].length || j<0 || !node.child.containsKey(maze[i][j])){
46                return;
47            }
48            char ch=maze[i][j];
49            node=node.child.get(ch);
50            if(node.isTerminal!=null){
51                ll.add(node.isTerminal);
52                node.isTerminal=null;
53            }
54            maze[i][j]='*';
55            Search(maze,i+1,j,node);
56            Search(maze,i,j+1,node);
57            Search(maze,i-1,j,node);
58            Search(maze,i,j-1,node);
59            maze[i][j]=ch;
60        }
61		
62	}
63}