class Solution {
    public int thirdMax(int[] nums) {
        Long f=null, s=null, t=null;

        for(int num:nums){
            long val = (long) num;
            if((f!=null && f==val) || (s!=null && s==val) || (t!=null && t==val)){
                continue;
            }
            if(f==null || val>f){
                t=s;
                s=f;
                f=val;
            }
            else if(s==null || val>s){
                t=s;
                s=val;
            }
            else if(t==null || val>t){
                t=val;
            }
        }
        return t==null ? f.intValue() : t.intValue();
    }
}