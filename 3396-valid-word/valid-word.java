class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        
            boolean vowels = false;
            boolean consonants = false;

        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }

            if(isVowel(ch)){
                vowels=true;
            }
            else if(Character.isLetter(ch)){
                consonants = true;
            }
        }

        return vowels && consonants;
        
    }

    private boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return (ch == 'a') || ch=='e'|| ch=='i' || ch=='o' || ch=='u';
    }
}