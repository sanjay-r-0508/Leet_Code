class Solution {
    public int longestValidParentheses(String s) {
        int maxLen =0;
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        if(s.length() == 0) return count;

       stack.push(-1); 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i); 
            }
            else {
                stack.pop(); 
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}