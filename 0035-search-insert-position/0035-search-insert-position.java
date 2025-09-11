class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        if(nums.length==1 && target>nums[0]){
                index=1;
        }
        for(int i=0; i<nums.length-1; i++){
            if(target>nums[nums.length-1]){
                index=nums.length;
            }
            else if(target>nums[i] && target<=nums[i+1]){
                index=i+1;
            }
        }
        return index;
    }
}