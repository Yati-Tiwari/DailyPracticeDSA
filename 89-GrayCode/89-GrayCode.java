// Last updated: 8/14/2025, 11:26:21 AM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            ll.add(i^(i>>1));
        }
        return ll;
    }
}