// Last updated: 8/5/2026, 9:15:54 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        reverse(nums,0,n-k-1);
6        reverse(nums,n-k,n-1);
7        reverse(nums,0,n-1);
8    }
9    public static void reverse(int[] arr,int i,int j){
10        while(i<j){
11            int temp=arr[i];
12            arr[i]=arr[j];
13            arr[j]=temp;
14            i++;
15            j--;
16        }
17       
18    }
19}
20