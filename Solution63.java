public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        // Check whether the first block is viable
        if (obstacleGrid[0][0] == 1) return 1;
        obstacleGrid[0][0] = 1;

        // make sure the first row and the first col is settled
        for (int i = 1; i < col; i++) {
            if (obstacleGrid[0][i] == 0) obstacleGrid[0][i] = 1;
            else break;
        }

        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 0) obstacleGrid[i][0] = 1;
            else break;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[row - 1][col - 1];
    }
}