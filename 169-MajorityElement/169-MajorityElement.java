// Last updated: 8/14/2025, 11:25:33 AM
class Solution {
    public int majorityElement(int[] nums) {
        return MajorityElement(nums);
    }
    public static int MajorityElement(int[] num) {
		int e=num[0];
		int v=1;
		for(int i=1;i<num.length;i++) {
			if(num[i]==e) {
				v++;
			}
			else {
				v--;
				if(v==0) {
					e=num[i];
					v=1;
				}
			}
		}
		return e;
	}

}
