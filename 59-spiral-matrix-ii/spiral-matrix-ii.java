class Solution {
    public int[][] generateMatrix(int n) {
        int r = n, c = n;
        int[][] matrix = new int[r][c];
        int num = 1;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

         while (num <= (n*n) && top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (num <= n*n && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (num <= n*n && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }  
}