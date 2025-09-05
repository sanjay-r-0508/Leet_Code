class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonal = 0;

        for (int[] dim : dimensions) {
            int length = dim[0];
            int width = dim[1];

            int diagonal =length * length + width * width;
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } 
            else if (diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;  
            }
        }

        return maxArea;
    }
}
