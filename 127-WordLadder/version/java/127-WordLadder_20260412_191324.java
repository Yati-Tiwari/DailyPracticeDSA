// Last updated: 4/12/2026, 7:13:24 PM
1class Solution {
2    HashMap<String, List<String>> map;
3
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5        map=new HashMap<>();
6        for (String w : wordList) {
7            map.put(w,new ArrayList<>());
8        }
9        for (int i=0;i<wordList.size();i++) {
10            for (int j=i+1;j<wordList.size();j++) {
11                if (isConnected(wordList.get(i), wordList.get(j))) {
12                    map.get(wordList.get(i)).add(wordList.get(j));
13                    map.get(wordList.get(j)).add(wordList.get(i));
14                }
15            }
16        }
17        // add beginWord
18        if (!map.containsKey(beginWord)) {
19            map.put(beginWord, new ArrayList<>());
20            for (String w : wordList) {
21                if (isConnected(beginWord, w)) {
22                    map.get(beginWord).add(w);
23                    map.get(w).add(beginWord);
24                }
25            }
26        }
27        return bfs(beginWord,endWord);
28    }
29    public int bfs(String src,String des) {
30        Queue<String> q=new LinkedList<>();
31        HashSet<String> visited=new HashSet<>();
32        q.add(src);
33        int level=1;
34        while (!q.isEmpty()) {
35            int size=q.size();
36            for (int i=0; i<size; i++) {
37                String r=q.poll();
38                if (visited.contains(r)){
39                    continue;
40                }
41                visited.add(r);
42                if (r.equals(des)){
43                    return level;
44                }
45                for (String nbr : map.get(r)) {
46                    if (!visited.contains(nbr)) {
47                        q.add(nbr);
48                    }
49                }
50            }
51            level++;
52        }
53        return 0;
54    }
55    private boolean isConnected(String a,String b) {
56        int diff=0;
57        for (int i=0; i < a.length(); i++) {
58            if (a.charAt(i) != b.charAt(i)){
59                diff++;
60            }
61            if (diff > 1){
62                return false;
63            }
64        }
65        return diff==1;
66    }
67}