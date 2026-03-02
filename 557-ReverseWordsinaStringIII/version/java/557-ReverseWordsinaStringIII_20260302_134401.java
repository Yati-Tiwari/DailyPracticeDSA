// Last updated: 3/2/2026, 1:44:01 PM
1public class Solution {
2    public String reverseWords(String s) {
3        char[] arr=s.toCharArray();
4        int start=0;
5        for (int end=0; end<=arr.length; end++) {
6            if (end==arr.length || arr[end]==' ') {
7                int left=start, right=end-1;
8                while (left < right) {
9                    char temp=arr[left];
10                    arr[left++]=arr[right];
11                    arr[right--]=temp;
12                }
13                start=end+1;
14            }
15        }
16        return new String(arr);
17    }
18}
19