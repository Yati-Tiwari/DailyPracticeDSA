// Last updated: 1/28/2026, 9:03:10 PM
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        //height 1 se 100 ke liye list bana di
4        List<Integer>[] a=new ArrayList[101];  //a:bucket
5        for (int i=0; i<=100; i++) {
6            a[i]=new ArrayList<>();
7        }
8        //rectangles ko unki height ke bucket me daalo
9        for (int i=0; i<rectangles.length; i++) {
10            int l=rectangles[i][0];
11            int h=rectangles[i][1];
12            a[h].add(l);
13        }
14        // har bucket ko sort karo (binary search ke liye)
15        for (int j=1; j<=100; j++) {
16            Collections.sort(a[j]);
17        }
18        int[] ans=new int[points.length];
19        // har point ke liye answer
20        for (int i=0; i<points.length; i++) {
21            int x=points[i][0];
22            int y=points[i][1];
23            int count=0;
24            //sirf heights >= y check karni hai
25            for (int j=y;j<=100;j++) {
26                List<Integer> ll=a[j];
27                if (ll.size()==0){
28                    continue;
29                }
30                // first index j where list[j]>=x
31                int idx=lowerBound(ll,x);
32                // total rectangles=size -idx
33                count+=ll.size()-idx;
34            }
35            ans[i]=count;
36        }
37        return ans;
38    }
39
40    // lower bound function (first index >=target)
41    public int lowerBound(List<Integer>ll,int target) {
42        int l=0;
43        int r=ll.size();
44        while (l<r) {
45            int mid=l+(r-l) / 2;
46            if (ll.get(mid)<target) {
47                l=mid+1;
48            } else {
49                r=mid;
50            }
51        }
52        return l;
53    }
54}
55