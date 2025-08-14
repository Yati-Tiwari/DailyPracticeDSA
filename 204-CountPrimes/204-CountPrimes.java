// Last updated: 8/14/2025, 11:25:16 AM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrimeSieve(n);
    }
    public static int PrimeSieve(int n) {
		int[] ans=new int[n];
		ans[0]=ans[1]=1;
		for(int i=2;i*i<=ans.length;i++) {
			if(ans[i]==0) { // i is prime here and its factor 
				for(int j=2;i*j<ans.length;j++) {
					ans[i*j]=1;
				}
			}
		}
		int c=0;
		for(int i=0;i<ans.length;i++) {
			if(ans[i]==0) c++;
		}
		return c;
	}

}