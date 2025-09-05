class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, start = 0, end = n-1, middle=0, index=-1;
        if(n%2!=0) middle = n/2;
        else middle = (int)(((n - 1) / 2) + (n / 2)) / 2;

        if(nums[middle] == target){
            index = middle;
        }
        else{
            while(start<=middle && end>=middle){
                if(nums[start]==target){
                    index=start;
                    break;
                }
                else if(nums[end]==target){
                    index=end;
                    break;
                }
                else{
                    start++;
                    end--;
                }
            }
        }
        return index;
    }
}