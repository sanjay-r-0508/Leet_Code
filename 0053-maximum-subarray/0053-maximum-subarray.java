class Solution {
    public int maxSubArray(int[] nums) {
        int soFarMax = nums[0];
        int currentMax = nums[0];

        for(int i=1; i<nums.length; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            soFarMax = Math.max(soFarMax, currentMax);
        }
        return soFarMax;
    }
}