// Last updated: 2/11/2026, 12:44:42 PM
1class Solution {
2    public int findMaximumXOR(int[] arr) {
3		// TODO Auto-generated method stub
4		Trie t=new Trie();
5		for(int x:arr) {
6			t.add(x);
7		}
8		int ans=0;
9		for(int x:arr) {
10			ans=Math.max(t.getMaxXor(x),ans);
11		}
12		return ans;
13	}
14	static class Trie{
15		class Node{
16			Node zero; // zero:left
17			Node one; // one:right
18		}
19		private Node root=new Node();
20		public void add(int val) {
21			Node curr=root;
22			for(int i=31;i>=0;i--) {
23				int bit=val & (1<<i);
24				if(bit==0) {
25					if(curr.zero!=null) {
26						curr=curr.zero;
27					}
28					else {
29						Node nn=new Node();
30						curr.zero=nn;
31						curr=nn;
32					}
33				}else {
34					if(curr.one !=null) {
35						curr=curr.one;
36					}else {
37						Node nn=new Node();
38						curr.one=nn;
39						curr=nn;
40					}
41				}
42			}
43		}
44		public int getMaxXor(int x) {
45			int ans=0;
46			Node curr=root;
47			for(int i=31;i>=0;i--) {
48				int bit=x & (1<<i);
49				if(bit==0) {
50					if(curr.one!=null) {
51						ans=ans | (1<<i);
52						curr=curr.one;
53					}else {
54						curr=curr.zero;
55					}
56				}
57				else {
58					if(curr.zero!=null) {
59						ans=ans|(1<<i);
60						curr=curr.zero;
61					}else {
62						curr=curr.one;
63					}
64				}
65			}
66			return ans;
67		}
68	}
69
70}
71