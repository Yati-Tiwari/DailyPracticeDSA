// Last updated: 8/14/2025, 11:18:15 AM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int count=0;
        for(int j=0;i<players.length && j<trainers.length;j++){
            if(players[i]<=trainers[j]){
                count++;
                i++;
            }
        }
        return count;
    }
}