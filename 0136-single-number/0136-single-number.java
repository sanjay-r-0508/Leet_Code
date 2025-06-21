class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                set.remove(n);
            }
        }
        return set.iterator().next();
    }
}