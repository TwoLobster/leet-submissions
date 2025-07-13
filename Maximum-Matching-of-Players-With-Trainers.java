class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
     Arrays.sort(players);
     Arrays.sort(trainers);
     int i=players.length-1;
     int j=trainers.length-1;
     while(i>=0 && j>=0){
        if(trainers[j]>=players[i]){
            count++;
            j--;
            i--;
        }
        else i--;
     }
     return count;
    }
}