class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i]=new StringBuilder();
        }

        int curRow=0;
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            rows[curRow].append(c);

            if(curRow == 0 || curRow == numRows-1){
                goingDown = !goingDown;
            }

            if(goingDown){
                curRow++;
            }
            else{
                curRow--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder row : rows){
            sb.append(row);
        }

        return sb.toString();
    }
}