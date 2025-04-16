class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> rmap = new HashMap<>();
        rmap.put('I',1);
        rmap.put('V',5); 
        rmap.put('X',10); 
        rmap.put('L',50); 
        rmap.put('C',100); 
        rmap.put('D',500); 
        rmap.put('M',1000);

        int total=0;
        for(int i=0; i<s.length(); i++){
            int val=rmap.get(s.charAt(i));

            if((i+1) <s.length()){
                int next=rmap.get(s.charAt(i+1));
                if(val<next)
                    total-=val;
                else
                    total+=val;
            
            }
            else
                total+=val;
        } 
        return total;
    }
}