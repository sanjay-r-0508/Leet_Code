class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower-1); 
    }

    private long count(int[] nums, int target){
        long res = 0;
        int i =0, j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>target)
                j--;
            else
                res = res + j - i++;
        }
        return res;
    }
}