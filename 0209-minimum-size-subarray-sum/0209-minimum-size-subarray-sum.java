class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int sum=0;

        for(end=0; end<nums.length; end++){
            sum+=nums[end];
            while(sum>=target){
                minLength=Math.min(minLength, end-start+1);
                sum-=nums[start++];
            }
        }
        
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}