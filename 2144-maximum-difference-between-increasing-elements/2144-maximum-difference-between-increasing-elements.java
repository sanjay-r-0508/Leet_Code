class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxDiff=0;
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
        if(maxDiff==0){
            maxDiff=-1;
        }
        return maxDiff;
    }
}