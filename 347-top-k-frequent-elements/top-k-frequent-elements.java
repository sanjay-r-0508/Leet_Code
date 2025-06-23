class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int fre = map.get(key);
            if(bucket[fre]==null){
                bucket[fre]=new ArrayList<>();
            }
            bucket[fre].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=bucket.length-1; i>=0 && res.size() < k; i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}