class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char sub = 'a';

        for(char ch : key.toCharArray()){
            if(ch != ' ' && !map.containsKey(ch)){
                map.put(ch, sub);
                sub++;
            }
        }

        StringBuilder decode = new StringBuilder();
        for(char ch : message.toCharArray()){
            if(ch ==' '){
                decode.append(ch);
            }
            else{
                decode.append(map.get(ch));
            }
        }
        return decode.toString();
    }
}