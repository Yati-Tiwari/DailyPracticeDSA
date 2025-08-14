// Last updated: 8/14/2025, 11:22:22 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>(); 
        for (int i=0;i<n;i++) {
            while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()]) {
                int prevIndex=st.pop();
                ans[prevIndex]=i-prevIndex;
            }
            st.push(i);
        }
        return ans;
    }
}
