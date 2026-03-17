// Last updated: 3/17/2026, 11:08:31 AM
1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if(!(str1+str2).equals(str2+str1)){
4            return "";
5        }
6        int gcdlen=gcd(str1.length(),str2.length());
7        return str1.substring(0,gcdlen);
8    }
9    public static int gcd(int a,int b){
10        while(b!=0){
11            int temp=b;
12            b=a%b;
13            a=temp;
14        }
15        return a;
16    }
17}
18        