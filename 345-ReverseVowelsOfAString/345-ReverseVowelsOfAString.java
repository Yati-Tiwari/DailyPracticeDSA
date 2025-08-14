// Last updated: 8/14/2025, 11:24:30 AM
class Solution {
    public String reverseVowels(String s) {
        char[] Arr=s.toCharArray();
        int left=0;
        int right=Arr.length - 1;
        String Vowels = "aeiouAEIOU";     
        while (left < right) {
            while (left < right && Vowels.indexOf(Arr[left]) == -1) 
            {
                left++;
            }
            while (left < right && Vowels.indexOf(Arr[right]) == -1) {
                right--;
            }
            char temp = Arr[left];
            Arr[left] = Arr[right];
            Arr[right] = temp;           
            left++;
            right--;
        }       
        return new String(Arr);
    }
}
