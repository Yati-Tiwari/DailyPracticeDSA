// Last updated: 1/20/2026, 10:27:12 PM
1class Solution {
2    public int maximumLength(String s) {
3        int n=s.length();
4        int l=0;
5        int r=n;
6        while(l < r){
7            int mid=(l+r+1) / 2;
8            if(check(s,n,mid)){
9                l=mid;
10            }
11            else{
12                r=mid-1;
13            }
14        }
15        if(l==0){
16            return -1;
17        }
18        return l;
19    }
20    private boolean check(String s,int n,int x){
21        int[] cnt=new int[26];
22        int i=0;
23        while(i < n){
24            int j=i+1;
25            while(j < n && s.charAt(j)==s.charAt(i)){
26                j++;
27            }
28
29            int idx=s.charAt(i) - 'a';
30            int len= j-i;
31            cnt[idx]+=Math.max(0 ,len-x+1);
32            if(cnt[idx]>=3){
33                return true;
34            }
35            i=j;
36        }
37        return false;
38    }
39}
40// binary search lagaya answer ke length ke upar
41// mid represent karega possible length
42// l < r tak check chala rahe
43
44// check function bolega ki kya length x ka substring same char ka 3 bar mil sakta
45// s ko segment me tod rahe jaise "aaabbccc" type
46// har segment ka len nikal ke count add kar diya
47// cnt[idx] >= 3 matlab 3 valid substring mil gaye to true
48
49// len - x + 1 se pata chalta kitne substring ban sakte us segment me
50// jab possible ho to l = mid, warna r = mid-1
51// end me l=0 matlab kuch nahi mila to -1
52