class Solution {
    public int lengthOfLastWord(String s) {

        String clean=s.trim();

        int count=0;
        for(int i=clean.length()-1; i>=0; i--){
            if(clean.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}