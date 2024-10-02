class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException("Input grid is null");
        }
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int Rows = grid.length;
        int Columns = grid[0].length;
        if (Rows == 1 && Columns == 1) {
            return grid[0][0];
        }

        if (Columns <= Rows) {
            return minPathSumHelper(grid, Rows, Columns, true);
        } else {
            return minPathSumHelper(grid, Columns, Rows, false);
        }
    }

    private int minPathSumHelper(int[][] grid, int big, int small, boolean isColsSmall) {
        int[] dp = new int[small];
        dp[0] = grid[0][0];
        for (int j = 1; j < small; j++) {
            dp[j] = dp[j - 1] + (isColsSmall ? grid[0][j] : grid[j][0]);
        }

        for (int i = 1; i < big; i++) {
            dp[0] += isColsSmall ? grid[i][0] : grid[0][i];
            for (int j = 1; j < small; j++) {
                dp[j] = Math.min(dp[j], dp[j - 1]) + (isColsSmall ? grid[i][j] : grid[j][i]);
            }
        }
        return dp[small - 1];
    }
}
