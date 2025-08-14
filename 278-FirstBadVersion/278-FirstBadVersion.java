// Last updated: 8/14/2025, 11:24:52 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int lo=1;
	int hi=n;
	int ans=0;
	while(lo<=hi) {
		int mid=lo+(hi-lo)/2;
		if(isBadVersion(mid)) {
			ans=mid;
			hi=mid-1;
		}
		else {
			lo=mid+1;
		}
	}
    return ans;
   }
}