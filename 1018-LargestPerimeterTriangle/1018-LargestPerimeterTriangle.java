// Last updated: 8/14/2025, 11:21:10 AM
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {2, 1, 2};
        System.out.println(solution.largestPerimeter(A)); 
    }
}
