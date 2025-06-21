class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String str="";
        int n=0;

        for(char C: s.toCharArray()){
            if(Character.isDigit(C)){
                n=n*10+(C - '0');
            }
            else if(C == '['){
                numStack.push(n);
                strStack.push(str);
                n=0;
                str="";
            }
            else if(C == ']'){
                StringBuilder sb = new StringBuilder(strStack.pop());
                int repeat = numStack.pop();
                for(int i=0; i<repeat; i++){
                    sb.append(str);
                }
                str=sb.toString();
            }
            else{
                str += C;
            }
        }
        return str;
    }
}