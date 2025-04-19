class Solution {
    public void rotate(int[][] matrix) {
       transpose(matrix);
       reverse(matrix);
    }
    public void transpose(int[][] matrix){
    int m=matrix.length;
    int n =matrix[0].length;

        for(int i=0; i<m; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;;
            }
        }
    }

    public void reverse(int[][] matrix){
        int n =matrix.length;
        for(int i=0; i<n; i++){
            int left=0, right=matrix.length-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}