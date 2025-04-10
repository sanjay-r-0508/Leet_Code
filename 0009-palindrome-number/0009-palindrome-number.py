class Solution:
    def isPalindrome(self, x: int) -> bool:
        num=str(x)
        rnum=num[::-1]
        return num==rnum