// Last updated: 8/29/2025, 7:53:41 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        char[] arr=palindrome.toCharArray();
        for(int i=0;i<palindrome.length()/2;i++){
            if(arr[i] != 'a'){
                arr[i]='a';
                return new String(arr);
            }

        }
        arr[palindrome.length()-1]='b';
        return new String(arr);
    }
}