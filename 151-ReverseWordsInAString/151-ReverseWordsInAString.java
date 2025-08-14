// Last updated: 8/14/2025, 11:25:46 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		String[] arr=s.split(" +");
		String ans=" ";
		for(int i=arr.length-1;i>=0;i--) {
			ans+=arr[i]+" ";
		}
		return ans.trim();
    }
}