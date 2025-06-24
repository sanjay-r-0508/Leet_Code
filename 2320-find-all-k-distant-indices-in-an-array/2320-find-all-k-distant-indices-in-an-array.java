class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                index.add(i);
            }
        }

        for(int i=0; i<nums.length; i++){
            for(int j : index){
                if(Math.abs(i-j)<=k){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}