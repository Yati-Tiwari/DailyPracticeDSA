// Last updated: 9/28/2025, 12:57:04 PM
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> base=new ArrayList<>();
        int position=1;
        while(n>0){
            if(n % 10 !=0){
                base.add((n%10)*position);
            }
            n/=10;
            position=position * 10;
        }
        int[] res=new int[base.size()];
        int i=0;
        for(int j=base.size()-1;j>=0;j--){
            res[i++]=base.get(j);
        }
        return res;
    }
}