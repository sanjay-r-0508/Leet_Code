class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0]=0;

        int pos =1;
        for(int i=0; i<gain.length; i++){
            res[pos]=res[i] + gain[i];
            pos++;
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i < res.length; i++){
            if(res[i]>max){
                max=res[i];
            }
        }
        return max;
    }
}