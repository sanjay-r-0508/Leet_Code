class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int i=0;

        StringBuilder sb = new StringBuilder();

        while(i<len1 && i<len2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
            
        }
        if(i<len1){
            sb.append(word1.substring(i));
            i++;
        }
        else if(i<len2){
            sb.append(word2.substring(i));
            i++;
        }
        return sb.toString();
    }
}