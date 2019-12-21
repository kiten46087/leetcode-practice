public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        
        while (row >= 0 && col <= matrix[0].length - 1) {
            int current = matrix[row][col];
            if (current == target) return true;
            else if (current > target) {
                row -= 1;
            } else {
                col += 1;
            }
        }

        return false;
    }
}