// Last updated: 12/24/2025, 7:54:41 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if(word1.length() != word2.length()){
4            return false;
5        }
6        int[] frq1=new int[26];
7        int[] frq2=new int[26];
8        for(int i=0;i<word1.length();i++){
9            frq1[word1.charAt(i)-'a']++;
10        }
11        for(int i=0;i<word2.length();i++){
12            frq2[word2.charAt(i)-'a']++;
13        }
14        for(int i=0;i<26;i++){
15            if((frq1[i]==0 && frq2[i]>0) || (frq2[i]==0 && frq1[i]>0)){
16                return false;
17            }
18        }
19        Arrays.sort(frq1);
20        Arrays.sort(frq2);
21        return Arrays.equals(frq1,frq2);
22    }
23}