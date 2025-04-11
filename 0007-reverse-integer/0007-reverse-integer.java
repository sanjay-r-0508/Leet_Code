class Solution {
    public int reverse(int x) {
        int ans=0;

        while(x!=0){
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                return 0;
            }
            int rem = x%10;
            ans=ans*10+rem;
            x=x/10; 
        }
        return ans;
    }
}