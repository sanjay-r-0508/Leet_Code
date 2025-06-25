class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE, s=Long.MIN_VALUE, t=Long.MIN_VALUE;

        for(int num:nums){
            if((long) num>f){
                t=s;
                s=f;
                f=num;
            }
            else if((long)num >s && (long)num!=f){
                t=s;
                s=num;
            }
            else if((long) num > t && (long) num!=f && (long)num!=s){
                t=num;
            }
                    
        }
        return t==Long.MIN_VALUE ? (int)f : (int) t;
    }
}