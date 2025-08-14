// Last updated: 8/14/2025, 11:17:09 AM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n=nums.length;
        int m=queries.length;
        int[] ans=new int[m];
        int[] Indices=new int[n];
        int count=0;
        for (int i = 0;i < n;i++) {
            if (nums[i]==x) {
                Indices[count++]=i;
            }
        }
        for (int i = 0;i < m;i++) {
            int query=queries[i];
            if (query>count) {
                ans[i] = -1;  
            } else {
                ans[i] = Indices[query-1];  
            }
        }       
        return ans;
    }
}
