// Last updated: 4/1/2026, 2:27:08 PM
1class Solution {
2    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
3        int n=positions.length;
4        int[][] robots=new int[n][4];
5        for(int i=0; i<n; i++){
6            robots[i][0]=positions[i];
7            robots[i][1]=healths[i];
8            robots[i][2]=directions.charAt(i); 
9            robots[i][3]=i;
10        }
11        Arrays.sort(robots, (a,b) -> a[0]-b[0]);//sort by position
12        Stack<int[]> st=new Stack<>();
13        for(int[] robot : robots){
14            if(robot[2]=='R') {
15                st.push(robot);
16            }
17            else{
18                // L direction
19                while(!st.isEmpty() && st.peek()[2]=='R') {
20                    int[] top=st.peek();
21                    if (top[1] > robot[1]){
22                        top[1]--;  // R survives
23                        robot[1]=0;
24                        break;
25                    }
26                    else if(top[1]<robot[1]){
27                        robot[1]--; // L survives
28                        st.pop();
29                    }
30                    else{
31                        // equal
32                        st.pop();
33                        robot[1] = 0;
34                        break;
35                    }
36                }
37                if (robot[1] > 0) {
38                    st.push(robot);
39                }
40            }
41        }
42        List<int[]> survivors=new ArrayList<>(st);/// collect survivors
43        Collections.sort(survivors, (a,b) -> a[3]-b[3]);
44        List<Integer> rslt=new ArrayList<>();
45        for (int[] r : survivors) {
46            rslt.add(r[1]);
47        }
48        return rslt;
49    }
50}