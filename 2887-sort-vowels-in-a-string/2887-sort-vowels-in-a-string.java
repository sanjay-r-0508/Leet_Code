class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        List<Character> vowelsList = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                vowelsList.add(c);
            }
        }

        Collections.sort(vowelsList);

        StringBuilder sd = new StringBuilder();
        int i=0;
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                sd.append(vowelsList.get(i++));
            }
            else{
                sd.append(ch);
            }
        }
        return sd.toString();
    }
}