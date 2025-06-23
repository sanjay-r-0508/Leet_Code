class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if(!map.containsKey(comp)){
                map.put(nums[i], i);
            }
            else{
                return new int[]{map.get(comp)+1, i+1};
            }
        }
        return new int[]{};
    }
}