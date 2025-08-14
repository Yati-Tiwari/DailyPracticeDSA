// Last updated: 8/14/2025, 11:21:59 AM
class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int Total=0;
        int i=0;
        while (i<answers.length) {
            int count=1; 
            int Current=answers[i];
            while (i + count<answers.length && answers[i + count]==Current) {
                count++;
            }
            int Group_Size=Current+1;
            int Groups=(count + Current)/Group_Size; 
            Total += Groups*Group_Size;
            i+=count;
        }
        return Total;
    }
}
