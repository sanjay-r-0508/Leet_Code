class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxSum=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
                maxSum=Math.max(maxSum, sum);
            }
            else{
                sum=nums[i];
            }
        }
        return maxSum;
    }
}