// Last updated: 12/7/2025, 9:10:51 AM
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        Integer[] br=new Integer[nums.length];
4        for(int i=0;i<nums.length;i++){
5            br[i]=nums[i];
6        }
7        Arrays.sort(br,(p,q)->{
8            int rfP=Printref(p);
9            int rfQ=Printref(q);
10            if(rfP != rfQ){
11                return rfP-rfQ;
12            }
13            return p-q;
14        });
15        
16        for(int i=0;i<nums.length;i++){
17            nums[i]=br[i];
18        }
19        return nums;
20    }
21    public int Printref(int a){
22        if(a==0){
23            return 0;
24        }
25        String g=Integer.toBinaryString(a);
26        Stack<Character> stack=new Stack<>();
27        for(char c:g.toCharArray()){
28            stack.push(c);
29        }
30        StringBuilder r=new StringBuilder();
31        while(!stack.isEmpty()){
32            r.append(stack.pop());
33        }
34        return Integer.parseInt(r.toString(),2);
35    }
36}