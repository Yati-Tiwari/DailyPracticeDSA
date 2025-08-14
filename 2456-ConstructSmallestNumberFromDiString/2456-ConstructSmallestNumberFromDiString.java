// Last updated: 8/14/2025, 11:18:30 AM
// class Solution {
//     public String smallestNumber(String pattern) {
//         int num=pattern.length();
//         char[] ans=new char[num+1];
//         for(int i=0;i<=num;i++){
//            ans[i]=(char) ('1'+i);
//         }
//         int i=0;
//         while(i<num){
//             if(pattern.charAt(i)=='D'){
//                 int start=i;
//                 while(i<num && pattern.charAt(i)=='D'){
//                     i++;
//                 }
//                 int left=start;
//                 int right=i;
//                 while(left<right){
//                     char temp=ans[left];
//                     ans[left]=ans[right];
//                     ans[right]=temp;
//                     left++;
//                     right--;
//                 }
                
//             }
//             else{
//                     i++;
//                 }

//         }
//         return new String(ans);
//     }
// }
class Solution {
    public static String smallestNumber(String pattern) {
		    int[] arr=new int[pattern.length()+1];
		    int c=1;
		    Stack<Integer> st=new Stack<>();
		        for(int i=0;i<=pattern.length();i++){
		            if(pattern.length()==i||pattern.charAt(i)=='I'){
		            	arr[i]=c;
		            	c++;
		            	while(!st.isEmpty()) {
		            		arr[st.pop()]=c;
		            		c++;
		            	}
		            }else{
		            	st.push(i);
		            }
		        }
		        String s="";
		        for(int i:arr) {
		        	s=s+i;
		        }
		        return s;
		    }
}