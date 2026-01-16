// Last updated: 1/16/2026, 10:13:09 PM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        int n=changed.length;
4        if (n%2!=0){
5            return new int[0]; //odd length:impossible
6        }
7        Arrays.sort(changed);
8        Map<Integer,Integer> map=new HashMap<>();
9        for (int i=0;i<changed.length;i++) {
10            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
11        }
12        if (map.getOrDefault(0,0)%2!=0){
13            return new int[0];
14        }
15        int[] ans=new int[n/2];
16        int indx=0;
17        for (int i=0;i<changed.length;i++) {
18            if (map.get(changed[i])==0){
19                continue;
20            }
21            int y=changed[i]*2;
22            if (map.getOrDefault(y,0)==0){
23                return new int[0];
24            }
25            map.put(changed[i],map.get(changed[i])-1);
26            map.put(y,map.get(y)-1);
27            ans[indx++]=changed[i];
28        }
29        return ans;
30    }
31}
32