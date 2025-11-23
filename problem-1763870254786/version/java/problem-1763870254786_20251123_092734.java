// Last updated: 11/23/2025, 9:27:34 AM
class Solution {
    public long sumAndMultiply(int n) {
        Stack<Integer> st=new Stack<>();
        int tempo=n;
        int sum=0;
        while(tempo != 0){
            int dgt=(int)(tempo % 10);
            sum+=dgt;
            if(dgt!=0){
                st.push(dgt);
            }
            tempo/=10;
        }
        if(st.isEmpty()){
            return 0;
        }
        long x=0;
        while(!st.isEmpty()){
            int a=st.pop();
            x=x*10+a;
        }
        return x*sum;
    }
}