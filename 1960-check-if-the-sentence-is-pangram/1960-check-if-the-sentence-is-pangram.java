class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=97;i<=122;i++){
            if(!sentence.contains(String.valueOf((char)i)))   return false ;
        }
        return true ;
    }
}