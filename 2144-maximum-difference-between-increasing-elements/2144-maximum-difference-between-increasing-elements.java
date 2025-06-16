class Solution {
    public int maximumDifference(int[] nums) {
     int n=nums.length;
     int i=0, maxDiff=-1;

        for(int j=1; j<n; j++){
            if(j>i && nums[i]<nums[j]){
                int dif=nums[j]-nums[i];
                if(dif>maxDiff){
                    maxDiff=dif;
                }
            }
            else{
                i=j;
            }
        }
    return maxDiff;   
    }
}