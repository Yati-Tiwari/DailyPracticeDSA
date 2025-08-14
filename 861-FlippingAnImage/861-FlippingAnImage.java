// Last updated: 8/14/2025, 11:21:51 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int N=image.length;
        for (int i = 0; i < N; i++) {
           for (int j = 0; j < (N+1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][N- 1 - j] ^ 1;
                image[i][N-1-j] = temp;
            }
        }
        return image;
    }
}
