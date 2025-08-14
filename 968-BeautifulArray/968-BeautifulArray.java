// Last updated: 8/14/2025, 11:21:23 AM
class Solution {
    public int[] beautifulArray(int n) {
        int[] ans=new int[n];
        if(n==1){
            ans[0]=1;
            return ans;
        }
        int[] y=beautifulArray(n/2);
        int[] x=beautifulArray((n+1)/2);
        for(int i=x.length;i<n;i++){
            ans[i]=y[i-x.length]*2;
        }
        for(int i=0;i<x.length;i++){
            ans[i]=x[i]*2-1;
        }
        return ans;
    }
}