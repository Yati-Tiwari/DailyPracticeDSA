// Last updated: 8/14/2025, 11:22:50 AM
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] Frequencies=new int[26];
        for (int i=0;i < tasks.length; i++) {
            Frequencies[tasks[i]-'A']++;
        }
        Arrays.sort(Frequencies);
        int Max_Freq=Frequencies[25];
        int idle_Time = (Max_Freq - 1) * n;
        for (int i = 24; i >= 0 && idle_Time > 0; i--) {
            idle_Time -= Math.min(Frequencies[i], Max_Freq - 1);
        }
        idle_Time = Math.max(0,idle_Time);
        return tasks.length + idle_Time;
    }
}
