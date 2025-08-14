// Last updated: 8/14/2025, 11:21:37 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int Boats=0;
        while (left<=right) {
            if (people[left] + people[right]<=limit) {
                left++;
            }
            right--;
            Boats++;
        }
        return Boats;
    }
}
