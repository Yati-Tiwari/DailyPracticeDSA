// Last updated: 8/14/2025, 11:27:23 AM
class Solution {
    public List<String> generateParenthesis(int n) {
     
		List<String> arr=new ArrayList<>();
		Parentheses(n,0,0,"",arr);
		return arr;
	}
	public static void Parentheses(int n, int closed,int open,String ans,List<String> arr) {
		
		if(open==n && closed==n) {
//			System.out.println(ans);
			arr.add(ans);
			return;
		}
		if(open>n || closed>open) {
			return;
		}
		Parentheses(n,closed,open+1,ans+"(",arr);
		Parentheses(n,closed+1,open,ans+")",arr);
		
	}
	

}