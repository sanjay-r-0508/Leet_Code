class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int num=0;
        while(x>0){
            int digit = x%10;
            num=num*10+digit;
            x/=10;
        }
        return og==num;
    }
}