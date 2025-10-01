// Last updated: 10/1/2025, 2:03:20 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // using brute force time complexity = O(n^2)
        // string mei first acharacter se kitni substring bn rhu hain aur baki sbse jo substring bn rhi hain us mei chck krenge ki ese substring jis mei duplicate character nhi ho longest substring leni hai ,is mei set use kr skte hain set ki property hoti hai vo duplicate character ko add nhi krta 
        // optimal technique mei sliding window use krenge 2 pointer 
       
       int left=0;
       int right=0;
       Set<Character> seen = new HashSet();
       int max=0;
       while(right<s.length()){
       // char =s.charAt(right);//a
        if(seen.add(s.charAt(right))){ // koi dublicate nhi mila tb
           max=Math.max(max,right-left+1); // window size
           right++; //move foreword
        }else{
            seen.remove(s.charAt(left)); //duplicate character mila to use bhi remove kra
            left++;
           }
        }
        return max;
    }
}