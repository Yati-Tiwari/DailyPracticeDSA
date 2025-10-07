// Last updated: 10/7/2025, 11:11:19 AM
class Solution {
    private int count=0;
    public int countArrangement(int n) {
        boolean[] used=new boolean[n+1];
        backtrack(1,n,used);
        return count;
    }
    public void backtrack(int pos,int n,boolean[] used){
        if(pos>n){
            count++;
            return;
        }
    for(int i=1;i<=n;i++){
        if(!used[i] && (pos%i ==0 || i%pos ==0)){
            used[i]=true;
            backtrack(pos+1,n,used);
            used[i]=false;
        }
    }
    }
}