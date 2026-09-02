class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;

            int digit=columnNumber%26;
            str.append((char) (digit+'A'));
            columnNumber=columnNumber/26;
        }
        return str.reverse().toString();
    }
}