// Last updated: 7/13/2026, 9:29:22 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ll=new ArrayList<>();
4        String digits="123456789";
5        for(int len=2;len<=9;len++){ 
6            for(int start=0; start+len<=9; start++){
7                int num=Integer.parseInt(digits.substring(start,start+len));
8                if(num>=low && num<=high){
9                    ll.add(num);
10                }
11            }
12        }
13        return ll;
14    }
15}
16