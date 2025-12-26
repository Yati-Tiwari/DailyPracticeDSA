// Last updated: 12/26/2025, 12:44:51 PM
1class Solution{
2    public long minimumTime(int[] time,int totalTrips){
3        // minimum time nikal rahehain manually
4        int minTime=time[0];
5        for(int i=0;i<time.length;i++){
6            if(time[i]<minTime){
7                minTime=time[i];
8            }
9        }
10        long left=1;                     
11        long right=(long)minTime*totalTrips;  
12        long rslt=right;
13        // binary search lagaya humne.,
14        while(left<=right){
15            long mid=left+(right-left)/2;
16            // check kar rahe itne time me trips complete ho rahi ya nahi
17            if(canComplete(time,totalTrips,mid)){
18                rslt=mid;      //answer possible hai
19                right=mid-1;     //aur chhota try karo
20            }else{
21                left=mid+1;      //time kam hai,badhao
22            }
23        }
24        return rslt;
25    }
26
27    private boolean canComplete(int[] time,int totalTrips,long t){
28        long trips=0;
29        //har bus kitni trips karegi
30        for(int i=0;i<time.length;i++){
31            trips+=t/time[i];
32            //agar required trips ho gayi to true
33            if(trips>=totalTrips){
34                return true;
35            }
36        }
37        return false; //trips complete nahi hui
38    }
39}
40