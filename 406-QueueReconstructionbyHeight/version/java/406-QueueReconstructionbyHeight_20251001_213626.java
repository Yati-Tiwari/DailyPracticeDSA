// Last updated: 10/1/2025, 9:36:26 PM
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Step 1: sort by height descending, k ascending krni hai
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];  // taller first
            } 
            else{
                 return a[1]-b[1];    // smaller k first
            }          
        });
        // Step 2: insert at index = k
        List<int[]> Result = new ArrayList<>();
        for (int i=0; i < people.length; i++) {
            Result.add(people[i][1], people[i]); // insert kro
        }
        // Step 3: convert to array
        return Result.toArray(new int[people.length][]);
    }
}
