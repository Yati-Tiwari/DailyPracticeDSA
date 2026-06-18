// Last updated: 6/18/2026, 2:05:31 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] Arr=s.toCharArray();
4        int left=0;
5        int right=Arr.length - 1;
6        String Vowels = "aeiouAEIOU";     
7        while (left < right) {
8            while (left < right && Vowels.indexOf(Arr[left]) == -1) 
9            {
10                left++;
11            }
12            while (left < right && Vowels.indexOf(Arr[right]) == -1) {
13                right--;
14            }
15            char temp = Arr[left];
16            Arr[left] = Arr[right];
17            Arr[right] = temp;           
18            left++;
19            right--;
20        }       
21        return new String(Arr);
22    }
23}
24