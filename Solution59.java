public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        // Edge Case
        if (n == 0) return matrix;

        // Normal Case
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int num = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart += 1;
            
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd -= 1;
            
            for (int i = colEnd; i >= colStart; i--) {
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num++;
            }
            rowEnd -= 1;
            
            for (int i = rowEnd; i >= rowStart; i--) {
                if (rowStart <= colEnd)
                    matrix[i][colStart] = num++;
            }
            colStart += 1;
        }

        return matrix;
    }
}