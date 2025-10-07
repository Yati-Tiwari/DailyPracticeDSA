// Last updated: 10/7/2025, 7:07:38 AM
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int flowerCount = flowers.length;
        int[] startTimes = new int[flowerCount];
        int[] endTimes = new int[flowerCount];

        for (int i = 0; i < flowerCount; i++) {
            startTimes[i] = flowers[i][0];
            endTimes[i] = flowers[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int peopleCount = people.length;
        int[] result = new int[peopleCount];

        for (int i = 0; i < peopleCount; i++) {
            int flowersStarted = binarySearch(startTimes, people[i] + 1);
            int flowersEnded = binarySearch(endTimes, people[i]);
            result[i] = flowersStarted - flowersEnded;
        }

        return result;
    }
    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}
