class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxDiff=-1;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]<nums[j]){
                    int diff=nums[j]-nums[i];
                    if(diff>maxDiff){
                        maxDiff=diff;
                    }
                }
                else{
                    break;
                }
            }
        }
        return maxDiff;
    }
}