// Last updated: 12/23/2025, 12:15:36 PM
1class Solution {
2    public String generateTag(String caption) {
3        StringBuilder sb=new StringBuilder();
4        sb.append('#');
5        String[] ans_ar=caption.trim().split(" ");
6        if(ans_ar.length<=0){
7            return "#";
8        }
9        sb.append(ans_ar[0].toLowerCase());
10        for(int i=1;i<ans_ar.length;i++){
11            int wordleng=ans_ar[i].length();
12            if(wordleng==0){
13                continue;
14            }
15                sb.append(ans_ar[i].substring(0,1).toUpperCase());
16                sb.append(ans_ar[i].substring(1).toLowerCase());
17                if(sb.length()>=100){
18                    break;
19                }
20            }
21            String rslt=sb.toString();
22            if(rslt.length()>=100){
23                return rslt.substring(0,100);
24            }
25            return rslt;
26    }
27}