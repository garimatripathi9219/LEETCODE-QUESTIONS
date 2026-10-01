class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        // Step 1: Apply cyclic left shift on each row
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            int k = rowShift[i] % n;
            for (int j = 0; j < n; j++) {
                int newCol = (j - k + n) % n;
                temp[i][newCol] = grid[i][j];
            }
        }

        // Step 2: Apply cyclic upward shift on each column
        int[][] ans = new int[n][n];
        for (int j = 0; j < n; j++) {
            int k = colShift[j] % n;
            for (int i = 0; i < n; i++) {
                int newRow = (i - k + n) % n;
                ans[newRow][j] = temp[i][j];
            }
        }

        return ans;
    }
}