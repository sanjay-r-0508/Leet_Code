class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;
        int[] res= new int[nums.length];

        while(i<=j){
            int leftSquare=nums[i]*nums[i];
            int rightSquare=nums[j]*nums[j];

            if(leftSquare>rightSquare){
                res[pos]=leftSquare;
                i++;
                pos--;
            }
            else{
                res[pos]=rightSquare;
                j--;
                pos--;
            }
        }
        return res;
    }
}