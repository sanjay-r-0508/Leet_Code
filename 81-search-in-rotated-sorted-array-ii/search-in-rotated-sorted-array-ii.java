class Solution {
    public boolean search(int[] nums, int target) {
        int i=0, j=nums.length-1;

        if(nums.length == 1 && nums[0]==target){
            return true;
        }
        else if(nums.length == 1 && nums[0]!=target){
            return false;
        }
        
        while(i<=j){
            if(nums[i]==target){
                return true;
            }
            else if(nums[j]==target){
                return true;
            }
            else{
                i++;
                j--;
            }
        }
        return false;
    }
}