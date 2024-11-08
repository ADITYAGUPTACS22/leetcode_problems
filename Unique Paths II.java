class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int dp[] = new int[col];
        
        for(int i = 0; i < row; i++){
            int curr[] = new int[col];
            for(int j = 0; j < col; j++){
                if(obstacleGrid[i][j] == 1)
                    curr[j] = 0;
                else if(i == 0 && j == 0)
                    curr[j] = 1;
                else {
                    int bottom = 0, right = 0;
                    if(i > 0)
                        bottom = dp[j];
                    if(j > 0)
                        right = curr[j-1];
                    curr[j] = bottom + right;
                }
            }
            dp = curr;
        }
        return dp[col-1];
    }
}
